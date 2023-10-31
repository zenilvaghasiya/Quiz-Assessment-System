package com.zenil.quizassessmentmanagement.repository;

import com.zenil.quizassessmentmanagement.models.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {
}
