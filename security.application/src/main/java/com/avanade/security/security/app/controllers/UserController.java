package com.avanade.security.security.app.controllers;

import com.avanade.security.security.app.models.UserModel;
import com.avanade.security.security.app.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    public UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/list-all")
    public Iterable<UserModel>ListAll() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/save")
    public void addUser(@RequestBody UserModel user){
        userRepository.save(user);
    }

    @DeleteMapping(value = "/delete-user")
    public void deleteUser(@RequestBody UserModel user){
        userRepository.delete(user);
    }
}
