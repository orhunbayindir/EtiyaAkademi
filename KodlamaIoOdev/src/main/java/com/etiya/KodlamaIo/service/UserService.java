package com.etiya.KodlamaIo.service;

import com.etiya.KodlamaIo.dto.request.RegisterRequestDto;
import com.etiya.KodlamaIo.dto.response.UserResponseDto;
import com.etiya.KodlamaIo.entity.User;
import com.etiya.KodlamaIo.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {

   private final IUserRepository userRepository; //autowired neden istemiyo

    public User createUser(User user){
        return userRepository.save(user);
    }

   public UserResponseDto login(RegisterRequestDto dto){

        Optional<User> user = userRepository.findByEmailAndPassword(dto.getEmail(), dto.getPassword());

        if (user.isEmpty()){
            throw new RuntimeException("kullanıcı bulunamadı");

        }
        UserResponseDto userResponseDto = UserResponseDto.builder()
                .id(user.get().getId())
                .email(user.get().getEmail())
                .name(user.get().getUserName())
                .surname(user.get().getUserSurname())
                .build();
       return userResponseDto;


   }


    public User register(RegisterRequestDto dto){

      User user = User.builder()
              .userName(dto.getName()).userSurname(dto.getSurname()).email(dto.getEmail()).password(dto.getPassword()).build();

      return userRepository.save(user);

    }

    public String deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found ID: " + id));
        userRepository.deleteById(id);
        return "Silme başarılı";

    }

    @PutMapping("/put/{id}")
    public ResponseEntity<UserResponseDto> updateOne(@PathVariable("id") Long id,
                                                     @RequestBody User user) {

        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User update = existingUser.get();
            update.setUserName(user.getUserName());
            update.setUserSurname(user.getUserSurname());
            update.setEmail(user.getEmail());
            update = userRepository.save(update);
            UserResponseDto responseDto = new UserResponseDto();
            responseDto.setId(update.getId());
//            responseDto.setUserName(update.getUserName());
//            responseDto.setUserSurname(update.getUserSurname());
            responseDto.setEmail(update.getEmail());
            return ResponseEntity.ok(responseDto);
        }
        return ResponseEntity.notFound().build();
    }
}
