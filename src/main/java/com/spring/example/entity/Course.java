package com.spring.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "duration")
    private String duration;

    @OneToOne
    @JoinColumn(name = "description_id", referencedColumnName = "id", unique = true, nullable = true)
    private CourseDescription courseDescription;

    public Course() {
    }

    public Course(String name, String duration, CourseDescription courseDescription) {
        this.name = name;
        this.duration = duration;
        this.courseDescription = courseDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", courseDescription=" + courseDescription +
                '}';
    }
}