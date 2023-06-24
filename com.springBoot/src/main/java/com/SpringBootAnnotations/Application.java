package com.SpringBootAnnotations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myPack.Dog;

@SpringBootApplication
public class Application implements CommandLineRunner {
    
	
	@Autowired
	 private Student student;
	@Autowired
	 private Date data;
	@Autowired
	private Emp emp;
	@Autowired
	private Dog dog;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.student.studying();
		this.emp.whatYourname();
		this.dog.geting();
	}

}
