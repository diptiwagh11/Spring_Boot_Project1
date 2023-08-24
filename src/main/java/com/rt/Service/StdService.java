package com.rt.Service;

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
}
