package com.mythri.game_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mythri.game_app.dto.UserLoginRequest;
import com.mythri.game_app.dto.UserSignupRequest;
import com.mythri.game_app.entity.User;
import com.mythri.game_app.enums.UserRole;
import com.mythri.game_app.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User signup(UserSignupRequest request) {
        if (userRepository.findByUsername(request.getUsername()).isPresent()) {
            throw new RuntimeException("Username already taken!");
        }
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered!");
        }

        User user = new User(
                request.getUsername(),
                request.getEmail(),
                request.getPassword(),
                UserRole.ROLE_USER
        );

        return userRepository.save(user);
    }

    public User login(UserLoginRequest request) {
        Optional<User> userOpt = userRepository.findByUsername(request.getUsername());
        if (userOpt.isEmpty()) {
            throw new RuntimeException("User not found!");
        }
        User user = userOpt.get();

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid password!");
        }
        return user;
    }
}
