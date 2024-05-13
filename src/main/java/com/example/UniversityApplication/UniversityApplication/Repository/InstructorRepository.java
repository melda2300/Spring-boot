package com.example.demo.Repository;

import com.example.demo.Class.Course;
import com.example.demo.Class.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
