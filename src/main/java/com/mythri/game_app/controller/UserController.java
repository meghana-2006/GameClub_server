package com.mythri.game_app.controller;

import com.mythri.game_app.dto.UserLoginRequest;
import com.mythri.game_app.dto.UserSignupRequest;
import com.mythri.game_app.entity.User;
import com.mythri.game_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public User signup(@RequestBody UserSignupRequest request) {
        return userService.signup(request);
    }

    @PostMapping("/login")
    public User login(@RequestBody UserLoginRequest request) {
        return userService.login(request);
    }
}
