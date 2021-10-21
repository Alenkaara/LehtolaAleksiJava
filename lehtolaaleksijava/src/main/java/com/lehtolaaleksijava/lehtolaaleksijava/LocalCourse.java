package com.lehtolaaleksijava.lehtolaaleksijava;

public class LocalCourse extends Course {

    private String classRoom;
    private int studentLimit = 25;

    public LocalCourse(long courseId, String courseName, String teacherName) {
        super(courseId, courseName, teacherName);
        this.classRoom = classRoom;
        this.studentLimit = studentLimit;
    }
}
