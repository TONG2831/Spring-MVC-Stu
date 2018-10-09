package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
	
	private static String SUCCESS = "success";
	
	@RequestMapping("/test")
	public String helloTest() {
		System.out.println("test spring mvc");
		return SUCCESS;
	}
}
