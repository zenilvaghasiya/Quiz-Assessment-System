package com.zenil.quizassessmentmanagement.resources;

import com.zenil.quizassessmentmanagement.models.User;
import com.zenil.quizassessmentmanagement.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SelfResource {

    private final UserService userService;

    public SelfResource(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/api/self")
    public User user(@AuthenticationPrincipal OAuth2User principal) {
        String userId = (String) principal.getAttribute("sub");
        return this.userService.getUserById(userId);
    }

}
