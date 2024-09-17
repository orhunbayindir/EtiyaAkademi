package com.etiya.KodlamaIo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "User")
public class User {
    @Id
    private String id;
    private String userName;
    private String userSurname;
    private String email;
    private String password;
    private String profilPicture;

    @OneToMany(mappedBy = "user")
    private List<Course> courses;


}
