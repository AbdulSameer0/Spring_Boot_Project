package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Bank;
import com.springboot.repository.BankRepository;

@Service
public class BankService {
	@Autowired
	BankRepository bankRepository;

	public void insertData(Bank bank) {
		bankRepository.save(bank);
	}

	public List<Bank> getAllData(Bank bank) {
		ArrayList<Bank> list = new ArrayList<Bank>();
		bankRepository.findAll().forEach(list::add);
		return list;
	}
	
	public List<Bank> insertAllData(List<Bank> banks){
	  return	bankRepository.saveAll(banks);
		
	}
	
	public void deleteBYId(int id) {
		bankRepository.deleteById(id);
	}
	
	public void updateById(Bank bank) {
		bankRepository.save(bank);
	}
 }
