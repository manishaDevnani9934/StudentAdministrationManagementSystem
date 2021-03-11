package com.cg.sams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sams.entity.Teacher;

@Repository
public interface StaffRepository extends JpaRepository<Teacher, Integer>{

}
