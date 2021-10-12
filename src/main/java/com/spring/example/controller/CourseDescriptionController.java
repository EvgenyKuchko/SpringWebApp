package com.spring.example.controller;

import com.spring.example.entity.CourseDescription;
import com.spring.example.service.CourseDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/courseDescription")
public class CourseDescriptionController {

    @Autowired
    private CourseDescriptionService courseDescriptionService;

    @GetMapping("/show")
    public String showDescriptionByCourseId(@RequestParam("courseId") int courseId, Model model){
        CourseDescription courseDescription = courseDescriptionService.getDescriptionByCourseId(courseId);
        model.addAttribute("courseDescription",courseDescription);
        return "description-show";
    }

    @GetMapping("/form")
    public String showFormForAdd(Model model){
        CourseDescription courseDescription = new CourseDescription();
        model.addAttribute("courseDescription", courseDescription);
        return "description-form";
    }
}