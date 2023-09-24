package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Bank;
import com.springboot.service.BankService;

@RestController
public class Controller {
	
	@Autowired
	BankService bankService;
	
	//add one data as a same time
	@PostMapping("/insertData")
	public String insertDataBank(@RequestBody Bank bank) {
		bankService.insertData(bank);
		return "added!!";
		
	}
	
	// multiple data as a same time 
	@PostMapping("/insertAllData")
	public List<Bank> insertAllData(@RequestBody List<Bank> bank) {
	  return bankService.insertAllData(bank);
		
	}
	
	//get all data
	@GetMapping("/getAllData1")
	public List<Bank> getAllData(Bank banks) {
		return bankService.getAllData(banks);
	}
	
	//delete by id
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		bankService.deleteBYId(id);
		return "Delete Data By ID";
	}
	
	//updata data
	@PutMapping("/updateById/{bank}")
	public String updateById(@RequestBody Bank bank) {
		bankService.updateById(bank);
		return "Update By Id";
	}
	

}
