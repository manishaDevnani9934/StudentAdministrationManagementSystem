package com.cg.sams.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sams.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	
}
