package com.example.UniversityApplication.UniversityApplication.Controller;

import com.example.UniversityApplication.UniversityApplication.Class.Instructor;
import com.example.UniversityApplication.UniversityApplication.Service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Instructor")
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructor();
    }

    @GetMapping("/{id}")
    private Instructor getInstructorById( @PathVariable Long id ) {
        return instructorService.getInstructorById(id);
    }

    @PostMapping
    public Instructor createInstructor( @RequestBody Instructor instructor ) {
        return instructorService.createInstructor(instructor);
    }
}
