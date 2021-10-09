package com.spring.example.dao;

import com.spring.example.entity.Course;

import java.util.List;

public interface CourseDAO {

    List<Course> getCourses();

    void saveCourse(Course course);

    Course getCourse(int id);

    void deleteCourse(int id);
}