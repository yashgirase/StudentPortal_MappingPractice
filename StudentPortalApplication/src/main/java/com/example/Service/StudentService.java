package com.example.Service;

import com.example.Entity.Student;
import com.example.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student Successfully added..";
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public String updateMobileNoOfStudent(Integer id, String phoneNo) {
        Optional<Student> optional = studentRepo.findById(id);
        Student student;
        if(optional.isPresent()){
            student = optional.get();
        }else{
            return "Student not found with id " + id;
        }
        student.setPhoneNumber(phoneNo);
        studentRepo.save(student);
        return "Mobile no is successfully updated as "+ phoneNo;
    }

    public String removeStudent(Integer id) {
        studentRepo.deleteById(id);
        return "Student with id "+id+" deleted successfully";
    }
}