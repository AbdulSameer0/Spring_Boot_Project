package com.springboot.ums.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.ums.entity.Employee;



public interface UMSRepository extends CrudRepository<Employee, Integer>{

	

}
