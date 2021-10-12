package com.spring.example.service;

import com.spring.example.dao.CourseDescriptionDAO;
import com.spring.example.entity.CourseDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CourseDescriptionServiceImpl implements CourseDescriptionService {

    @Autowired
    private CourseDescriptionDAO courseDescriptionDAO;

    @Override
    @Transactional
    public List<CourseDescription> getDescriptions() {
        return courseDescriptionDAO.getDescriptions();
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

    @Override
    @Transactional
    public CourseDescription getDescriptionByCourseId(int id) {
        return courseDescriptionDAO.getDescriptionByCourseId(id);
    }
}