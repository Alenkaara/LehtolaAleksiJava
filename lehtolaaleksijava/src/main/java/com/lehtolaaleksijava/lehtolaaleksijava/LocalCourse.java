package com.lehtolaaleksijava.lehtolaaleksijava;

public class LocalCourse extends Course {

    public LocalCourse(long courseId, String courseName, String teacherName) {
        super(courseId, courseName, teacherName);
        //TODO Auto-generated constructor stub
    }
    private String classRoom;
    private int studentLimit = 25;

}
