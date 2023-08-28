package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		return "Added Successfully";
		
	}
	
	@GetMapping("/student/id/{id}")
	public Student selectbyId(@PathVariable int id){
		
		Student s=ss.selectbyId(id);
		
		return s;
		
	}
	
	@DeleteMapping("/student/id/{id}")
	public Student deletebyId(@PathVariable int id){
		
		Student s=ss.deleteDataById(id);
		
		return s;
		
	}
	
	@GetMapping("/student/name/{name}")
	public List<Student> selectbyname(@PathVariable String name){
		
		List<Student> list=ss.selectbyname(name);
		
		return list;
		
	}
	@GetMapping("/student/division/{division}")
	public List<Student> selectbydivision(@PathVariable String division){
		
		List<Student> list=ss.selectbydivision(division);
		
		return list;
		
	}
	
	

}
