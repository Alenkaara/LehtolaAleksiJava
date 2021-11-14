package com.aleksi.lehtolaaleksijava;

public class Course {
    private long courseId;
    private String courseName;
    private String teacherName;
    private String classRoom;

    private static long idCounter = 0;

    public Course(String courseName, String teacherName, String classRoom) {
        this.courseId = idCounter++;
        this.courseName = courseName;
        this.classRoom = classRoom;
        this.teacherName = teacherName;
    }

    public long getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassRoom() {
        return this.classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

}
