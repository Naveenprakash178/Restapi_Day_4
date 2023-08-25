package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repository.StudentRepo;
@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	public List<Student> show()
	{
		return repo.findAll();
	}
	public void putDetails(Student student)
	{
		repo.save(student);
	}
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	public Student get(Integer id)
	{
		return repo.findById(id).get();
	}
}