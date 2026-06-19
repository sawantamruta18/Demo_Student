package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	@GetMapping("display")
	public List<Student> displayStudents(){
		return ss.display();
		
	}
	
	@PostMapping("add")
	public void addStudent(Student s) {
		ss.add(s);
	}
}
