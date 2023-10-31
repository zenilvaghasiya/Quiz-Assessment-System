package com.zenil.quizassessmentmanagement.resources;

import com.zenil.quizassessmentmanagement.models.User;
import com.zenil.quizassessmentmanagement.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/api/user/{id}")
    public User getUser(@PathVariable String id){
        return this.userService.getUserById(id);
    }
}
