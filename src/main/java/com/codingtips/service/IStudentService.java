package com.codingtips.service;

import java.util.List;

import com.codingtips.model.Student;

public interface IStudentService {
	
	//save
	Integer saveStudent(Student s);
	
	//update
	void updateStudent(Student s);
	
	//delete
	void deleteStudent(Integer id);
	
	//getOne
	Student getOneStudent(Integer id);
	
	//getAll
	List<Student> getAllStudents();

}
