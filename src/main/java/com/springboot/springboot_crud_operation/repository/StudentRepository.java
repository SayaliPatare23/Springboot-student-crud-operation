package com.springboot.springboot_crud_operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springboot_crud_operation.entity.Student;

public interface StudentRepository extends JpaRepository<Student ,Integer>{

}
