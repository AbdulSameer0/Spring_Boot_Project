package com.springboot.EMP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeData")
public class Employee {
  @Id
  private int id;
  private String name;
  private String role;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Employee(int id, String name, String role) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}
