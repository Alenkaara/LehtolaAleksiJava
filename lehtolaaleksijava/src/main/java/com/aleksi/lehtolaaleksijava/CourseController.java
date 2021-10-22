package com.aleksi.lehtolaaleksijava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("students")
    public List<Student> getStudents() {
        return courseService.students;
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
        return courseService.courses;
    }
    
    @GetMapping("onlinecourses")
    public List<Course> getOnlineCourses() {
        return courseService.courses;
    }

    @GetMapping("students/{id}")
    public List<Student> getStudentInfoById(@PathVariable long id) {
        return courseService.getStudentById(id);
    }

    @GetMapping("courses/{id}")
    public List<Course> getCourseInfoById(@PathVariable long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("add")
    public String addStudentToCourse(@RequestBody Student student) {
        try {
            courseService.students.add(student);
            return "Adding the student was successful.";
        } catch (Exception e) {
            return "Failed to add the student(s).";
        }
    }
}
