package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RequestMapping_PathVariable
 * 
 */
@Controller
@RequestMapping("/pathvariable")
public class RequestMappingPathVariable {
	
	@RequestMapping(value = "/test/{id}",method=RequestMethod.GET)
	public void testPathVariable(@PathVariable("id") int id) {
		System.out.println("pathVariable: id:"+id);
	}
}
