package com.zenil.quizassessmentmanagement.resources;

import com.zenil.quizassessmentmanagement.models.Question;
import com.zenil.quizassessmentmanagement.services.QuestionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionResource {

    private final QuestionService questionService;

    public QuestionResource(QuestionService questionService){
        this.questionService = questionService;
    }

    @GetMapping("/api/questions")
    public List<Question> getQuestions(){
        return questionService.getAllQuestions();
    }

//    User value = "/test/api/question" to expose it to everyone
    @PostMapping(value = "/api/question", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Question saveQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }

}
