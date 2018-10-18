package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class SViews {
	@RequestMapping("/test")
	public String test() {
		System.out.println("viewname");
		return "helloWorldView";
	}
}
