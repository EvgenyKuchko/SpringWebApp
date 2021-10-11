package com.spring.example.service;

import com.spring.example.entity.CourseDescription;

import java.util.List;

public interface CourseDescriptionService {

    List<CourseDescription> getDescription();

    void saveDescription(CourseDescription courseDescription);

    CourseDescription getDescription(int id);

    void deleteDescription(int id);
}
