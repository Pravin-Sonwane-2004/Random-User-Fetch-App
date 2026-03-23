package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users") // Optional: prefixes all routes with /users
public class UserController {

    @Autowired
    private UserService userService;

    // GET mapping to retrieve all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }

    // POST mapping to create a user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestParam String name) {
        User savedUser = userService.saveUser(name);
        return ResponseEntity.ok(savedUser);
    }
}
