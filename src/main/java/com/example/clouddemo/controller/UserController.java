package com.example.clouddemo.controller;

import com.example.clouddemo.Dao.UserRepository;
import com.example.clouddemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Miskai
 * @date 2019/3/4
 */
@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return this.userRepository.findById(id);
    }
}