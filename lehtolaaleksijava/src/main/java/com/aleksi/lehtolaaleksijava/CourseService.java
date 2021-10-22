package com.aleksi.lehtolaaleksijava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public List<Course> courses = new ArrayList<>();
    public List<Student> students = new ArrayList<>();

    public CourseService() {
        courses.add(new Course("CSS Basics", "Jani Takasalo", "www.youtube.fi.online"));
        courses.add(new Course("SQL Advanced Databases", "Akseli kallenkallela", "zoom.com.online"));
        courses.add(new Course("Unity Fundamentals", "Minna Korpinen", "A Siipi Luokka HI972"));
        courses.add(new Course("Swedish Cultures", "Sirpa Uotisalo", "A Siipi Luokka HI945"));
        courses.add(new Course("Java Native", "Pekka Päätiäinen", "B Siipi Luokka HI634"));
        courses.add(new Course("Linux Operators", "Minna Korpinen", "adobe.access.online"));
        courses.add(new Course("Money Making", "Jani Takasalo", "microsoft.teams.online"));
        courses.add(new Course("Web Programming", "Kari Porilainen", "C siipi Luokka HI345"));
        courses.add(new Course("Codebase Buidling", "Jani Takasalo", "www.youtube.fi.online"));
        courses.add(new Course("CSS Basics", "Matti Kilpuri", "A Siipi Luokka HI 1004"));
        courses.add(new Course("Backend vs frontend battle royale", "Pekka Päätiäinen", "zoom.com.online"));

        students.add(new Student("Jantteri", "Vaakataso"));
        students.add(new Student("Pekka", "mäkinen"));
        students.add(new Student("Joni", "Jarrunkato"));
        students.add(new Student("Seppo", "Kaivioinen"));
        students.add(new Student("Joonas", "Hyvärinen"));
        students.add(new Student("Karpo", "Kanankoipi"));
        students.add(new Student("Petteri", "Sakela"));
        students.add(new Student("Marko", "Laatinen"));
        students.add(new Student("Jussi", "Läpitulo"));
        students.add(new Student("Timo", "Suomalainen"));
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
    
    public List<Student> getStudentById(long studentId) {
        List<Student> foundStudentById = new ArrayList<>();

        for (Student student : students) {
            if (student.getStudentId()==(studentId)) {
                foundStudentById.add(student);
            }
        }
        return foundStudentById;
    }

    public List<Course> getCourseById(long courseId) {
        List<Course> foundCourseById = new ArrayList<>();

        for (Course course : courses) {
            if (course.getCourseId()==(courseId)) {
                foundCourseById.add(course);
            }
        }
        return foundCourseById;
    }

}
