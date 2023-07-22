package com.example.Service;

import com.example.Entity.Course;
import com.example.Repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;



    public String addCourse(Course Course) {
        courseRepo.save(Course);
        return "Course added successfully";
    }

    public Optional<Course> getCourseById(Integer id) {
        return courseRepo.findById(id);
    }

    public Iterable<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public String updateDurationOfCourse(Integer id, String duration) {
        Optional<Course> optional = courseRepo.findById(id);
        Course course;
        if(optional.isPresent()){
            course = optional.get();
        }else{
            return "Course not found with id " + id;
        }
        course.setDuration(duration);
        courseRepo.save(course);
        return "Course duration for Course with id "+id+ " successfully updated as "+duration;
    }

    public String removeCourse(Integer id) {
        courseRepo.deleteById(id);
        return "Course with id "+id+" is removed successfully..";
    }
}