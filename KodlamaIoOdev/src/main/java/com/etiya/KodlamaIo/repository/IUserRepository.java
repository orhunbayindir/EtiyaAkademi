package com.etiya.KodlamaIo.repository;


import com.etiya.KodlamaIo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User , Long> {
    Boolean existsByEmailAndPassword(String email ,String password);

    Optional<User> findByEmailAndPassword(String email, String password);//niye optionalla sarmam gerekti
}
