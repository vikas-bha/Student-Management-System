package com.example.StudentManagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagement.entity.*;
public interface StudentRepository extends JpaRepository<Student, Long> {

}
