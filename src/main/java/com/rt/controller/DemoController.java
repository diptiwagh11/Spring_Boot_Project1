package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Registration;

@RestController
public class DemoController {
//	@GetMapping("/hello")
//	public String demo(){
//		return "Welcome to Spring boot...";
//			
//	}
//	
//	@PostMapping("/data")
//	public Registration data()
//	{
//		Registration data=new Registration(2180,"Ram","ram@gmail.com","user");
//				return data;
//	}
//	
//	@PostMapping("/user")
//	public String data1(@RequestBody Registration r){
//		System.out.println(r.getUser_id()+""+r.getName()+""+r.getEmail()+""+r.getRole());
//		return "Data is Added...";
//	}

}
