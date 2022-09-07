package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.model.Student;



public interface StudentRepository extends JpaRepository<Student, Long> {

}
