package com.codingtips.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingtips.exception.StudentNotFoundException;
import com.codingtips.model.Student;
import com.codingtips.repository.StudentRepository;
import com.codingtips.service.IStudentService;
import com.codingtips.utility.StudentUtility;

@Service
public class IStudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public Integer saveStudent(Student s) {
		StudentUtility.calculateDtls(s);
		return repo.save(s).getStudId();
	}

	@Override
	public void updateStudent(Student s) {
		StudentUtility.calculateDtls(s);
		repo.save(s);

	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Student getOneStudent(Integer id) {
		Student s=repo.findById(id).orElseThrow(()->new StudentNotFoundException("Student Not Found"+id));
		return s;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
