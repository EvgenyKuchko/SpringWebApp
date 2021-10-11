package com.spring.example.service;

import com.spring.example.dao.CourseDescriptionDAO;
import com.spring.example.entity.CourseDescription;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class CourseDescriptionImpl implements CourseDescriptionService {

    @Autowired
    private CourseDescriptionDAO courseDescriptionDAO;

    @Override
    @Transactional
    public List<CourseDescription> getDescription() {
        return courseDescriptionDAO.getDescription();
    }

    @Override
    @Transactional
    public void saveDescription(CourseDescription courseDescription) {
        courseDescriptionDAO.saveDescription(courseDescription);
    }

    @Override
    @Transactional
    public CourseDescription getDescription(int id) {
        return courseDescriptionDAO.getDescription(id);
    }

    @Override
    @Transactional
    public void deleteDescription(int id) {
        courseDescriptionDAO.deleteDescription(id);
    }
}
