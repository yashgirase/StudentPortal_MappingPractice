package com.example.Controller;

import com.example.Entity.Course;
import com.example.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;



    @PostMapping("course")
    public String addCourse(@RequestBody Course Course){
        return courseService.addCourse(Course);
    }
    @GetMapping("course/id")
    public Optional<Course> getCourseById(@RequestParam Integer id){
        return courseService.getCourseById(id);
    }
    @GetMapping("courses")
    public Iterable<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @PutMapping("course/id/{id}/duration/{duration}")
    public String updateDurationOfCourse(@PathVariable Integer id , @PathVariable String duration){
        return courseService.updateDurationOfCourse(id , duration);
    }

    @DeleteMapping("course/id/{id}")
    public String removeCourse(@PathVariable Integer id){
        return courseService.removeCourse(id);
    }


}