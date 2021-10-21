package com.lehtolaaleksijava.lehtolaaleksijava;

public class OnlineCourse extends Course {

    private String courseAddress;

    public OnlineCourse(long courseId, String courseName, String teacherName, String courseAddress) {
        super(courseId, courseName, teacherName);
        this.courseAddress = courseAddress;
    }

    public String getCourseAddress() {
        return this.courseAddress;
    }

    public void setCourseAddress(String courseAddress) {
        this.courseAddress = courseAddress;
    }

}
