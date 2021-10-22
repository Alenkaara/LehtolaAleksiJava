package com.lehtolaaleksijava.lehtolaaleksijava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CourseFileService {
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();

    public CourseFileService(String courseFilePath) throws FileNotFoundException {
        File f = new File(courseFilePath);
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String[] courseInfo = sc.nextLine().split("---");
            Course c = new Course(courseInfo[0], courseInfo[1], courseInfo[2]);

            courses.add(c);
        }
    }
}

/*

        Scanner courseScanner = new Scanner(courses);
        while (courseScanner.hasNext()) {
            String course = courseScanner.nextLine();
            String[] c = course.split("---");
            boolean onlineChecker = Arrays.stream(c).anyMatch("online"::equals);
    
            if (onlineChecker) {
                System.out.println(c[0]);
                OnlineCourse onlineCourse = new OnlineCourse(c[0], c[1], c[2]);
                courses.add(onlineCourse);
            }
            else {
                System.out.println(c[0]);
                LocalCourse localCourse = new LocalCourse(courseId, c, teacherName)
            }
        }
        courseScanner.close();
*/