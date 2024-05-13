package com.example.UniversityApplication.UniversityApplication.Service;

import com.example.UniversityApplication.UniversityApplication.Class.Instructor;
import com.example.UniversityApplication.UniversityApplication.Repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAll();
    }

    public Instructor getInstructorById( Long id ) {
        return instructorRepository.findById(id).orElseThrow();

    }

    public Instructor createInstructor( Instructor instructor ) {
        return instructorRepository.save(instructor);
    }

}
