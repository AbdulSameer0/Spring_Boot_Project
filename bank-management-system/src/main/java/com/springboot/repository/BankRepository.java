package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{

}
