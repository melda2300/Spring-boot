package com.example.UniversityApplication.UniversityApplication.Controller;

import com.example.UniversityApplication.UniversityApplication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/sutudent")
public class StudentController {
    @Autowired
    private StudentService studentService;
    
}
