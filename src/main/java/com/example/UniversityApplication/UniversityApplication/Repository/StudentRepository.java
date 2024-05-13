package com.example.UniversityApplication.UniversityApplication.Repository;

import com.example.UniversityApplication.UniversityApplication.Class.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
