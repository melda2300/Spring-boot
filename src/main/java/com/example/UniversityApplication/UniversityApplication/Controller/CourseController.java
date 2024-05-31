package com.example.UniversityApplication.UniversityApplication.Controller;

import com.example.UniversityApplication.UniversityApplication.Class.Course;
import com.example.UniversityApplication.UniversityApplication.Dto.CourseDto;
import com.example.UniversityApplication.UniversityApplication.Repository.CourseRepository;
import com.example.UniversityApplication.UniversityApplication.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseRepository courseRepository;


    @GetMapping
    public ResponseEntity<List<CourseDto>> getCourses() {
        List<Course> courses = courseService.getCourses();
        List<CourseDto> courseDTOs = courses.stream().map(CourseDto::new).collect(Collectors.toList());
        return ResponseEntity.ok(courseDTOs);

    }

}