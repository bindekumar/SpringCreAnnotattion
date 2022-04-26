package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class TestBean implements Test {
	@Value("Bkkkkk")
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
    System.out.println(name);	
	}
   
}
