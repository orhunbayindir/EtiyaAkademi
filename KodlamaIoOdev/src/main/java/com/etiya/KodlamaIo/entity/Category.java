package com.etiya.KodlamaIo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "Category")
public class Category {
    @Id
    private String id;
    private String courseName;
    private String coursePicture;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;






}