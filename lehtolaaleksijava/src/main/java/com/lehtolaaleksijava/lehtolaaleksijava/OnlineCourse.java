package com.lehtolaaleksijava.lehtolaaleksijava;

public class OnlineCourse extends Course {

    public OnlineCourse(long courseId, String courseName, String teacherName) {
        super(courseId, courseName, teacherName);
        //TODO Auto-generated constructor stub
    }

    private String courseAddress;

    public String getCourseAddress() {
        return this.courseAddress;
    }

    public void setCourseAddress(String courseAddress) {
        this.courseAddress = courseAddress;
    }

}
