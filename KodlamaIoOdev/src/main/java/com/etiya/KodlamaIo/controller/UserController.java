package com.etiya.KodlamaIo.controller;


import com.etiya.KodlamaIo.dto.request.RegisterRequestDto;
import com.etiya.KodlamaIo.entity.User;
import com.etiya.KodlamaIo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/save")
    public ResponseEntity<?> createUser(String name, String surname, String email, String password) {
        User user = User.builder().userName(name).userSurname(surname)
                .password(password)
                .email(email)
                .build();
        try {
            userService.createUser(user);
            return ResponseEntity.ok(user);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("Kullanıcı oluşturulamadı");
        }
    }
    @GetMapping("/register")
    public ResponseEntity<User> register(RegisterRequestDto dto) {

        return ResponseEntity.ok(userService.register(dto));
    }

    @PostMapping("/register")
    public ResponseEntity<User> register2(@RequestBody RegisterRequestDto dto) {

        return ResponseEntity.ok(userService.register(dto));
    }

    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        return userService.deleteUser(id);
    }


}