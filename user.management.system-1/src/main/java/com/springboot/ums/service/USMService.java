package com.springboot.ums.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ums.dao.UMSRepository;
import com.springboot.ums.entity.Employee;

@Service
public class USMService {
  @Autowired
  UMSRepository  repository;
  
  public List<Employee> getemployee(){
	     List<Employee> list = new  ArrayList<>();
	  repository.findAll().forEach(list::add);
	return list;
  }
  
  //ADD EMPLOYEEs
  public void addEmployee(Employee employee) {
	  repository.save(employee);
  }
  
	/*
	 * public List<Employee> addAllEmpluyee(Employee employees){
	 * repository.saveAll(employees); return (List<Employee>) employees; }
	 */
  
  public void editEmployee(Employee employee) {
	   repository.save(employee);
  }
  public void deleteEmployee(int id) {
	  repository.deleteById(id);
  }
  public Optional<Employee> findEmployeeById(int id){
	  return repository.findById(id);
  }
  public List<Employee> findAllEmployees(){
	  return (List<Employee>) repository.findAll();
  }




}
