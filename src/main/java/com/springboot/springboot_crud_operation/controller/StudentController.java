package com.springboot.springboot_crud_operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.springboot_crud_operation.entity.Student;
import com.springboot.springboot_crud_operation.repository.StudentRepository;




	
	@RestController
	public class StudentController {
		
		@Autowired
		StudentRepository repo;
		
		//get all students
		@GetMapping("/students Data")
		public List<Student>getAllStudent(){
			List<Student>students=repo.findAll();
			return students;
			
		}
		
		//get student data by id
		@GetMapping("/students Data/{id}")
		public Student getStudent(@PathVariable int id) {
			Student student=repo.findById(id).get();
			return student;
		}
		
		
		//insert new data
		@PostMapping("/student Data/add")
		@ResponseStatus(code=HttpStatus.CREATED)
		public void createStudent(@RequestBody Student student) {
			repo.save(student);
			
		}
		
		
		//update data
		@PutMapping("/student Data/update/{id}")
		public Student updateStudents(@PathVariable int id) {
			Student student=repo.findById(id).get();
			student.setMarks(95);
			student.setRoll_no(2);
			repo.save(student);
			return student;
			
		}
		
		@DeleteMapping("/student Data/delete/{id}")
		public void removeStudent(@PathVariable int id) {
			Student student=repo.findById(id).get();
			repo.delete(student);
			
		}

	}



