package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.*;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}