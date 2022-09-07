package com.greatlearning.service;

import java.util.List;

import com.greatlearning.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public void addStudent(Student student);

}
