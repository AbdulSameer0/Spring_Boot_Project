package com.springboot.EMS.Dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.EMS.Bean.EmployeeBeans;

public interface EmployeeRepository extends CrudRepository<EmployeeBeans, Integer> {

}
