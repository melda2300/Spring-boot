package com.example.UniversityApplication.UniversityApplication.Repository;

import com.example.UniversityApplication.UniversityApplication.Class.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
