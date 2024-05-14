package com.example.UniversityApplication.UniversityApplication.Controller;

import com.example.UniversityApplication.UniversityApplication.Class.Student;
import com.example.UniversityApplication.UniversityApplication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sutudent")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getALlSutudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById( @PathVariable Long id ) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent( @RequestBody Student student ) {
        return studentService.createStudent(student);
    }
}