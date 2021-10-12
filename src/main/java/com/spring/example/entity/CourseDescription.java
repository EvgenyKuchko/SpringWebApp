package com.spring.example.entity;

import javax.persistence.*;

@Entity
@Table(name="description")
public class CourseDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="number_of_students")
    private int numberOfStudents;
    @Column(name="coast")
    private int coast;
    @Column(name="name")
    private String name;

    @OneToOne(mappedBy = "courseDescription")
    private Course course;

    public CourseDescription() {
    }

    public CourseDescription(int numberOfStudents, int coast, String name, Course course) {
        this.numberOfStudents = numberOfStudents;
        this.coast = coast;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CourseDescription{" +
                "id=" + id +
                ", numberOfStudents=" + numberOfStudents +
                ", coast=" + coast +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
