package com.lehtolaaleksijava.lehtolaaleksijava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RestController;

public class ICourseFileService {
    List<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> readCourseFiles(String courseFilePath) throws FileNotFoundException {
        Scanner courseScanner = new Scanner(courses);
    }
}
