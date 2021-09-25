package com.school.project.Entity;

public class Student {
    private int id;
    private String name;
    private String Course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        Course = course;
    }
    public Student(){}

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

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}
