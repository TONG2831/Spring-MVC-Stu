package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
	
	private static String SUCCESS = "success";
	/**
	 * 1.@RequestMapping 可以修饰方法,也可以修饰类;
	 * 2.
	 * 1).在类上,提供初步的请求映射信息.相对于WEB项目的根路径
	 * 2).在方法上,提供进一步的细分映射信息.相对于类定义出标记的的路径
	 * 如果类定义处未标注@RequestMapping,则在方法处标记的URL,相对于WEB应用的根路径.
	 * @return
	 */
	@RequestMapping("/test")
	public String helloTest() {
		System.out.println("test spring mvc");
		return SUCCESS;
	}
}
