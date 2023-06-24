package com.cms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Baby {
    @Id
    private int id;
    private String name;
    private String nationality;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Baby(int id, String name, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}
	public Baby() {
		
		// TODO Auto-generated constructor stub
	}
    
    
}
