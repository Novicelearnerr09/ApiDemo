package com.example.demospring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demospring.Entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
    
}
