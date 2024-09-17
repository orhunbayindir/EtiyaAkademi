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
@Table(name = "Course")
public class Course {
    @Id
    private String id;
    private String courseHeader;
    private String courseSummary;
    private String courseFree;
    private String profilPicture;
    private Double coursePrice;
    private Double rating;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

    @OneToMany(mappedBy = "course")
    private List<Category> categories;

    @OneToMany(mappedBy = "course")
    private List<Comment> comments;











}