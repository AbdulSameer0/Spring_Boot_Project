package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.dao.BabyRepository;
import com.cms.entity.Baby;
import com.cms.service.Services;

@RestController
public class Controller {
	
	@Autowired
	BabyRepository repository;
	@Autowired
	Services services;
	//add baby this method
	@PostMapping("/addBaby")
	public String addBaby(@RequestBody Baby baby) {
		services.addBaby(baby);
		return "ADDED BABY";
	}
	//fatch all baby
	@GetMapping("/getAllBaby")
	public List<Baby> getBaby(Baby baby){
		 return services.getAllChild(baby);
	}
	//delete baby by id 
	@DeleteMapping("delteByid/{id}")
	public String deleteBaby(@PathVariable ("id") int id) {
		services.delete(id);
		return "deleted!!";
		
	}
	
	//update 
	@PutMapping("/update")
	public Baby update(@RequestBody Baby baby) {
		services.update(baby, 0);
		return baby;
	}
	
	}

