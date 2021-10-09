package com.spring.example.service;

import com.spring.example.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();

    void saveCourse(Course course);

    Course getCourse(int id);

    void deleteCourse(int id);
}
