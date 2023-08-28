package com.rt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rt.entity.Student;

public interface StdDao  extends JpaRepository<Student, Integer>{

	List<Student> findByName(String name);
   
	@Query(value="select s from Student s where s.division=:d" , nativeQuery=false)
	List<Student> division(@Param("d")String d);

}
