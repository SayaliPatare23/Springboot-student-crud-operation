package com.springboot.springboot_crud_operation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	
	@Entity
	public class Student {
		
		@Id
		private int roll_no;
		private String name;
		private double marks;
		
		
		
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		
		public Student(int roll_no, String name, double marks) {
			super();
			this.roll_no = roll_no;
			this.name = name;
			this.marks = marks;
		}


		public int getRoll_no() {
			return roll_no;
		}
		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
		}
		
		
		

}
