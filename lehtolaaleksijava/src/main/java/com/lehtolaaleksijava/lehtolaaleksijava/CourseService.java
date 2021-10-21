package com.lehtolaaleksijava.lehtolaaleksijava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();
    public List<OnlineCourse> onlineCourses = new ArrayList<>();

    public CourseService() {

    }
    public List<Student> getStudents() {
        List<Student> found = new ArrayList<>();
            return found;
    }

    public List<Course> getCourses() {
        List<Course> found = new ArrayList<>();
            return found;
    }

    public List<Student> getStudentById(long studentId) {
        List<Student> found = new ArrayList<>();

        for (Student student : students) {
            if (student.getId()==(studentId)) {
                found.add(student);
            }
        }
        return found;
    }

    public List<Course> getCourseById(long courseId) {
        List<Course> found = new ArrayList<>();

        for (Course course : courses) {
            if (course.getCourseId()==(courseId)) {
                found.add(course);
            }
        }
        return found;
    }

    // public List<Course> getCoursesOfStudent(long studentId) {
    //     return AppController.getCoursesOfStudent(studentId);
    // }
}
