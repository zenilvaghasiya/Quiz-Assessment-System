package com.zenil.quizassessmentmanagement.repository;

import com.zenil.quizassessmentmanagement.models.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<Result, Long> {
}
