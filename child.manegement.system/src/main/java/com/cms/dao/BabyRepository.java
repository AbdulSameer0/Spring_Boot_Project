package com.cms.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.entity.Baby;

public interface BabyRepository extends CrudRepository<Baby, Integer> {

}
