package com.example.demo.Class;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity

public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String instructorNumber;
    private String name;
    private String email;
    @OneToMany(mappedBy = "instructor")
    private List<Course>courses;
}
