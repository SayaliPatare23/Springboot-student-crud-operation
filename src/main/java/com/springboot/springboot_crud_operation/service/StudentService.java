package com.springboot.springboot_crud_operation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springboot_crud_operation.entity.Student;
import com.springboot.springboot_crud_operation.repository.StudentRepository;



  @Service
	public class StudentService {
		
		@Autowired
		StudentRepository repo;
		public List<Student> getAll(){
			return repo.findAll();
		}
		
	    public Optional<Student> getById(int id){
	    	return repo.findById(id);
	    }
	    
	    public String insertStudent(Student student) {
	    	repo.save(student);
	    	return "Successfully added";
	    }
	    
	    public String updateStudent(int id,Student student) {
	    	Student student1=repo.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
	    	student1.setRoll_no(student.getRoll_no());
	    	student1.setName(student.getName());
	    	student1.setMarks(student.getMarks());
	    	repo.save(student1);
	    	return "sucessfully updated";
	    }
	    public String deleteStudent(int id) {
	    	repo.deleteById(id);
	    	return"delete Sucessfully";
	    }

	}


