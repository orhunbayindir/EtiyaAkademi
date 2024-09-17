package com.etiya.KodlamaIo.service;


import com.etiya.KodlamaIo.entity.Course;
import com.etiya.KodlamaIo.repository.ICourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final ICourseRepository courseRepository;

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }










}