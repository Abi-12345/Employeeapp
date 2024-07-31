package com.application.employeeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Employeecontroller {
	@GetMapping("/")
	public String getpage1() {
		return "<h1 style='color:red'>Home page</h1>";
		
				
	}
	@GetMapping("/page1/{id}")
	public String getpage2(@PathVariable Long id) {
		System.out.println("from page 2console get Url value" +id);
		return "<h1 style='color:blue'>product page</h1>";
	}
	

}
