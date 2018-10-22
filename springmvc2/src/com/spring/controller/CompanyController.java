package com.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.CompanyDao;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	CompanyDao companyDao;
	
	@RequestMapping("/selectAll")
	public String selectAll(Map<String, Object> map){
		map.put("list", companyDao.getEmployees());
		return "employee";
	}
	
}
