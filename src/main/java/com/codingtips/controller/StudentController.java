package com.codingtips.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingtips.model.Student;
import com.codingtips.service.IStudentService;

@RestController
@RequestMapping("/rest/student")
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	//save
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student s)
	{
		Integer id = service.saveStudent(s);
		String msg="Student saved with ID:"+id;
		return ResponseEntity.ok(msg);
	}
	
	//update
	@PutMapping("/edit/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable Integer id,@RequestBody Student s)
	{
		service.updateStudent(s);
		String msg="Student Updated with ID:"+id;
		return ResponseEntity.ok(msg);
	}
	
	//delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id)
	{
		service.deleteStudent(id);
		String msg="Student Deleted with ID"+id;
		return ResponseEntity.ok(msg);
	}
	
	//getOne
	@GetMapping("/one/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable Integer id)
	{
		Student s = service.getOneStudent(id);
		return ResponseEntity.ok(s);
	}
	
	//getAll
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> list = service.getAllStudents();
		return ResponseEntity.ok(list);
	}

}
