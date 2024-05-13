package com.example.UniversityApplication.UniversityApplication.Service;

import com.example.UniversityApplication.UniversityApplication.Class.Student;
import com.example.UniversityApplication.UniversityApplication.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById( Long id ) {
        return studentRepository.findById(id).orElseThrow();
    }

    public Student createStudent( Student student ) {
        return studentRepository.save(student);
    }
}
