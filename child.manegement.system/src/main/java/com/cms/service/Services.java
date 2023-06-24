package com.cms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.BabyRepository;
import com.cms.entity.Baby;

@Service
public class Services {
	@Autowired
	BabyRepository repository;
         
	public List<Baby> getAllChild(Baby baby) {
		  ArrayList<Baby> list = new ArrayList<>();
		  repository.findAll().forEach(list :: add);
		  return list;
	}
	
	public void addBaby(Baby baby) {
		repository.save(baby);
	}
	public void delete(int id) {
      repository.deleteById(id);
	}
	public void update(Baby baby,int id) {
		repository.save(baby);
	}
}
