package com.springboot.ums.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ums.dao.UMSRepository;
import com.springboot.ums.entity.Employee;
import com.springboot.ums.service.USMService;

@RestController
public class USMController {
	@Autowired
	USMService service;
	@Autowired
	UMSRepository repository;
	
	
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getEmployee(){
		 return service.getemployee();
	}
	
	
	@PostMapping("/addEmplyee")
	public String addEmplyee(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return "ADDED EMPLYEES";
		
	}
	/*
	 * @PostMapping("addmultipulEmplyee") public String
	 * addMultipulEmployee(@RequestBody Employee employee){
	 * repository.saveAll(employee); return "ADDED ALL EMPLYEES";
	 * 
	 * }
	 */
	
	@DeleteMapping("/delteEmplyeById/{id}")
	public String deleteEmplye(@PathVariable int id) {
		service.deleteEmployee(id);
		return "deleted by id ";
		
	}
	@GetMapping("/getEmployeeById/{id}")
	public Optional<Employee> findById(@PathVariable int id) {
		return service.findEmployeeById(id);
		
	}
	
	//ye nhi ho pa rha hai
	@PutMapping("/Editemployee{id}")
	public String editEmplyeeByID(@RequestBody @Validated Employee employee ) {
		 service.editEmployee(employee);
		 return "UPDATE";
	}
	
}
