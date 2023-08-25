package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.hibernate.annotations.Entity;

@Entity
public class Student {
	@Id
  private int id;
  private String StudentName;
  private String DepartmentName;
  private String emailid;
  
  
public Student(int id, String studentName, String departmentName, String emailid) {
	super();
	this.id = id;
	StudentName = studentName;
	DepartmentName = departmentName;
	this.emailid = emailid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getDepartmentName() {
	return DepartmentName;
}
public void setDepartmentName(String departmentName) {
	DepartmentName = departmentName;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
