package com.example.demo.Controller;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.Service.StudentService;

@RestController
public class ApiController {
@Autowired
StudentService ss;
		@GetMapping("/student")
		public List<Student>getDetails()
		{
			return ss.show();
		}
		
		@PutMapping("/student/{id}")
		public ResponseEntity<?> update(@RequestBody Student student,@PathVariable Integer id)
		{
			try {
				Student student1=ss.get(id);
				ss.putDetails(student1);
				return new ResponseEntity<>(HttpStatus.OK);
				
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		@DeleteMapping("/student/{id}")
		public void delete(@PathVariable Integer id)
		{
			ss.delete(id);
		}
		
}
