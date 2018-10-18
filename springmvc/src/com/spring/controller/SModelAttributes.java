package com.spring.controller;

import java.rmi.server.UID;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.pojo.User;

@Controller
@RequestMapping("/modelattribute")
public class SModelAttributes {
	
	/**
	 * 该注解注解的方法会在目标方法执行前,先执行
	 * @param map
	 */
	@ModelAttribute
	public void doBefore(@RequestParam(value="userId")String userId, Map<String, User> map) {
		User user = new User();
		user.setUserId("13");
		user.setUsername("张三");
		user.setPassword("this is password");
		
		map.put("user1", user);
		
		System.out.println("userID"+userId);
	}
	
	@RequestMapping("/test")
	public String test(User user){
		System.out.println("修改user的info user:"+user);
		return "success";
	}
}
