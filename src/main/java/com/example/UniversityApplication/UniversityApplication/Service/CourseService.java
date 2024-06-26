package com.example.UniversityApplication.UniversityApplication.Service;

import com.example.UniversityApplication.UniversityApplication.Class.Course;
import com.example.UniversityApplication.UniversityApplication.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
}
