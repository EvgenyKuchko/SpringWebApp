package com.spring.example.controller;

import com.spring.example.entity.Course;
import com.spring.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/list")
    public String listCourses(Model model){
        List<Course> courses = courseService.getCourses();
        model.addAttribute("courses", courses);
        return "list-courses";
    }

    @GetMapping("/form")
    public String showFormForAdd(Model model){
        Course course = new Course();
        model.addAttribute("course", course);
        return "course-form";
    }

    // при помощи аннотации modelAttribute все значение из html формы помещаются
    // в модель(model) course и сохраняются на полях объекта
    @PostMapping("/saveCourse")
    public String saveCourse(@ModelAttribute("course") Course course){
        courseService.saveCourse(course);
        return "redirect:/course/list";
    }

    @GetMapping ("/updateForm")
    public String updateCourse(@RequestParam("courseId") int courseId, Model model){
        Course course = courseService.getCourse(courseId);
        model.addAttribute(course);
        return "course-form";
    }

    @GetMapping("/delete")
    public String deleteCourse(@RequestParam("courseId") int courseId){
        courseService.deleteCourse(courseId);
        return "redirect:/course/list";
    }

    @GetMapping("/showDescription")
    public String showDescription(@RequestParam("descriptionId") int descriptionId){
        return "redirect:/courseDescription/show";
    }

    @GetMapping("/addDescription")
    public String addDescription(){

        return "description-form";
    }
}