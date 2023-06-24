package com.SpringBootAnnotations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.myPack.Dog;

@Configuration
@ComponentScan(basePackages = {"myPack"})
public class Myconfig {

   @Bean
   public Student getStudent() {
		System.out.println("creating student object ");
	   return new Student();
   }
   
   @Bean
   public Student getStudent1() {
		System.out.println("creating student object ");
	   return new Student();
   }
     
     @Bean
   	 public Date getDate() {
    	 System.out.println("creating a new data");
   		 return new Date();
   	 }
     @Bean 
     public Dog getDog() {
    	 System.out.println("am a dog am geting a new dog");
     
     return new Dog();
     }
    		 
   
}
