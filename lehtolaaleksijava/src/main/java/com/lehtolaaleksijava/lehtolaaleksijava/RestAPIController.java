package com.lehtolaaleksijava.lehtolaaleksijava;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
    CourseService courseService;

    String studentFilePath = "./files/students.txt";
    String courseFilePath = "./files/courses.txt";

    @Autowired

    @GetMapping("students")
    public List<Student> getStudents() throws FileNotFoundException {
        return courseService.students;
    }

    @GetMapping("courses")
    public List<Course> getCourses() throws FileNotFoundException {
        return courseService.courses;
    }
    
    @GetMapping("onlinecourses")
    public List<OnlineCourse> getOnlineCourses() throws FileNotFoundException {
        return courseService.onlineCourses;
    }

    @GetMapping("students/{id}")
    public List<Student> getStudentInfoById(@PathVariable long id) throws FileNotFoundException {
        return courseService.getStudentById(id);
    }

    @GetMapping("courses/{id}")
    public List<Course> getCourseInfoById(@PathVariable long id) throws FileNotFoundException {
        return courseService.getCourseById(id);
    }

    @PostMapping("add")
    public String addStudentToCourse(@RequestBody Student student) throws FileNotFoundException {
        try {
            courseService.students.add(student);
            return "Adding the student was successful.";
        } catch (Exception e) {
            return "Failed to add the student(s).";
        }
    }
}
