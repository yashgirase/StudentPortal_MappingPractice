package com.example.Controller;

import com.example.Entity.Student;
import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("student/id")
    public Optional<Student> getStudentById(@RequestParam Integer id){
        return studentService.getStudentById(id);
    }
    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PutMapping("student/phoneNo")
    public String updateMobileNoOfStudent(@RequestParam Integer id , @RequestParam String phoneNo){
        return studentService.updateMobileNoOfStudent(id , phoneNo);
    }

    @DeleteMapping("student/id/{id}")
    public String removeStudent(@PathVariable Integer id){
        return studentService.removeStudent(id);
    }
}