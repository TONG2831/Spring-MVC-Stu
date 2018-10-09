package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	/**
	 * 1.使用@RequestMapping 为控制器 指定处理那些请求
	 * 2.返回值会通过视图解析器 解析为实际的物理视图,对于InternalResourceViewResolver解析器,会做如下操作:
	 * 		prefix + return value + suffix ,然后转发
	 * @return
	 */
	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}
}
