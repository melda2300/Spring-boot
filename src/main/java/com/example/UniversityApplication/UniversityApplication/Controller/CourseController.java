package com.example.UniversityApplication.UniversityApplication.Controller;

import com.example.UniversityApplication.UniversityApplication.Class.Course;
import com.example.UniversityApplication.UniversityApplication.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/Courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @GetMapping(name = "/{id}")
    public Course getCoursesById( @PathVariable Long id){
        return courseService.getCourseById(id);
    }
    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return  courseService.createCourse(course);
    }
}
