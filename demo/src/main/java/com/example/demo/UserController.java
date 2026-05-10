package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/users") // Optional: prefixes all routes with /users
public class UserController {

    @Autowired
    private UserService userService;

    // GET mapping to rqetrieve all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }

    // POST mapping to create a user
    // @PostMapping
    // public ResponseEntity<User> createUser(@RequestBody User user) {
    //     User savedUser = userService.saveUser(user);
    //     return ResponseEntity.ok(savedUser);
    // }
        
        @PostMapping
        public List<User> saveUser() {
        User user = new User();
        List<User> list = new ArrayList<>();
        user.setId(25);
        user.setName("Pravin");
        user.setEmail("email@example.com");
        list.add(user);
        return list; // Spring converts this to: [{"id":25, "name":"Pravin", "email":"..."}]
    }
}
