package com.cg.sams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.sams.service.CourseService;

@SpringBootApplication
public class SchoolAdministrationManagementSystemApplication {

	@Autowired
	CourseService service;
	public static void main(String[] args) {
		SpringApplication.run(SchoolAdministrationManagementSystemApplication.class, args);
	}

}
