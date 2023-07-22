package com.example.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinTable(name = "fk_course_student-joinTable" , joinColumns = @JoinColumn(name = "fk_course_id") , inverseJoinColumns = @JoinColumn(name = "fk_student_id"))
    List<Student> studentList;
}