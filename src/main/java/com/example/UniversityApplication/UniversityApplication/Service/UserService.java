package com.example.UniversityApplication.UniversityApplication.Service;

import com.example.UniversityApplication.UniversityApplication.Dto.UserDto;
import com.example.UniversityApplication.UniversityApplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser( UserDto userDTO) {
        User user;
        user = new User(userDTO.getUsername(), userDTO.getPassword(), userDTO.getRole());
        userRepository.save(user);
    }
}
