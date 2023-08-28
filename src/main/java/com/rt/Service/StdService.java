package com.rt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.dao.StdDao;
import com.rt.entity.Student;

@Component
public class StdService {
	@Autowired
	StdDao Dao;

	public void addEmp(Student s) {
		
		Dao.save(s);
	}

	public Student selectbyId(int id) {
		Student s1=null;
		Optional<Student> s=Dao.findById(id);
		
		if(s.isPresent()){
			s1=s.get();
			return s1;
		}
		return s1;
	}

	public Student deleteDataById(int id) {
		Dao.deleteById(id);
		return null;
	}

	public List<Student> selectbyname(String name) {
		List<Student> list=Dao.findByName(name);
		return list;
	}

	public List<Student> selectbydivision(String division) {
		
		List<Student> list=Dao.division(division);
		return list;
	}
	
}
