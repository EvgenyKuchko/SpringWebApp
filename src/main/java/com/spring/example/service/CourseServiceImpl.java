package com.spring.example.service;

import com.spring.example.dao.CourseDAO;
import com.spring.example.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

// @Service - (Сервис-слой приложения) Аннотация, объявляющая, что этот класс представляет собой сервис – компонент сервис-слоя.
// Сервис является подтипом класса @Component. Использование данной аннотации позволит искать бины-сервисы автоматически.
// @Transactional определяет область действия одной транзакции БД.
@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDAO courseDAO;

    @Override
    @Transactional
    public List<Course> getCourses() {
        return courseDAO.getCourses();
    }

    @Override
    @Transactional
    public void saveCourse(Course course) {
        courseDAO.saveCourse(course);
    }

    @Override
    @Transactional
    public Course getCourse(int id) {
        return courseDAO.getCourse(id);
    }

    @Override
    @Transactional
    public void deleteCourse(int id) {
        courseDAO.deleteCourse(id);
    }
}