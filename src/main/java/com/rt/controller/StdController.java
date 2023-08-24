package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.Service.StdService;
import com.rt.entity.Student;

@RestController
public class StdController {
	
	@Autowired
	StdService ss;
	
	@PostMapping("/student")
	public String addEmp(@RequestBody Student s){
		
		ss.addEmp(s);
		
		return "Added";
		
	}

}
