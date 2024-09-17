package com.etiya.KodlamaIo.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    private String id;

    @Column(length = 140)
    private String content;

    @Builder.Default
    private LocalDate date = LocalDate.now();


    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;






}
