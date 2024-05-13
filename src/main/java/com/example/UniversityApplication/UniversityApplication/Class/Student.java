package com.example.UniversityApplication.UniversityApplication.Class;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentNumber;
    private String name;
    private String email;
    @ManyToMany
    @JoinTable(
            name = "student-course",
            joinColumns = @JoinColumn(name = "student-id"),
            inverseJoinColumns = @JoinColumn(name = "course-id")
    )
    private List<Course>courses;
}
