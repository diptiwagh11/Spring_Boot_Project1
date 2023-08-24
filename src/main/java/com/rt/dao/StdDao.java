package com.rt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.entity.Student;

public interface StdDao  extends JpaRepository<Student, Integer>{

}
