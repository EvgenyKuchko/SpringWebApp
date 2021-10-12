package com.spring.example.dao;

import com.spring.example.entity.CourseDescription;

import java.util.List;

public interface CourseDescriptionDAO {

    List<CourseDescription> getDescriptions();

    void saveDescription(CourseDescription courseDescription);

    CourseDescription getDescription(int id);

    void deleteDescription(int id);

    CourseDescription getDescriptionByCourseId(int id);
}
