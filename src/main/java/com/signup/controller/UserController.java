package com.signup.controller;

import com.signup.model.User;
import com.signup.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    // Signup endpoint
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {	
        // Check if username already exists
        if (userService.getUserByUsername(user.getUsername()) != null) {
            return ResponseEntity.badRequest().body("Username already exists.");
        }

        // Register the user without password encryption
        userService.registerUser(user);

        return ResponseEntity.ok("User registered successfully.");
    }

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User loginRequest) {
        // Find user by username
        User user = userService.getUserByUsername(loginRequest.getUsername());
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful.");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password.");
        }
    }
}
