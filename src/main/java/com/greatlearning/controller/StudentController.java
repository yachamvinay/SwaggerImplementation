package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.model.Student;
import com.greatlearning.service.StudentService;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(path = "/details")
	public List<Student> getStudentList()
	{
		return studentService.getAllStudents();
	}
	
	@PostMapping(path = "/addstudent")
	public List<Student> addStudentList(@RequestBody Student student)
	{
		studentService.addStudent(student);
		return studentService.getAllStudents(); 
	}
}
