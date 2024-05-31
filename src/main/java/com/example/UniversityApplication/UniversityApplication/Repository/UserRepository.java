package com.example.UniversityApplication.UniversityApplication.Repository;

import com.example.UniversityApplication.UniversityApplication.Class.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
