package com.example.UniversityApplication.UniversityApplication.Class;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseNumber;
    private String name;
    @ManyToMany(mappedBy = "courses")
    private List<Student>students;
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;
}
