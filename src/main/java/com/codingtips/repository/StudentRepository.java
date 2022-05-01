package com.codingtips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingtips.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
