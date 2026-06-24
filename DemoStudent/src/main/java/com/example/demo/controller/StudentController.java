package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

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
	
	@PostMapping("addAll")
	public void addAllStudent( @RequestBody List <Student> s) {
		ss.addAll(s);
	}
}
