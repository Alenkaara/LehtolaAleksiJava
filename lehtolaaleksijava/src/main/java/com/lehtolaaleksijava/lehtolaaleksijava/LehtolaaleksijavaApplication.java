package com.lehtolaaleksijava.lehtolaaleksijava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LehtolaaleksijavaApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LehtolaaleksijavaApplication.class, args);

		// CourseFileService studentFiles = new CourseFileService("./files/students.txt");
		// CourseFileService courseFiles = new CourseFileService("./files/courses.txt");
		
		// for (Student s : studentFiles.students) {
		// 	System.out.println(s.getFirstName() + " " + s.getLastName());
		// }
		// for (Course c : courseFiles.courses) {
		// 	System.out.println();
		// }
	}

}
