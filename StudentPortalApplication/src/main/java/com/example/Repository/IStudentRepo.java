package com.example.Repository;

import com.example.Entity.Student;
import com.example.Service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository // Not needed as jpa repo has @Repository on it
public interface IStudentRepo extends JpaRepository<Student, Integer> {
}