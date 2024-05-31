package com.example.UniversityApplication.UniversityApplication.Repository;

import com.example.UniversityApplication.UniversityApplication.Class.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
