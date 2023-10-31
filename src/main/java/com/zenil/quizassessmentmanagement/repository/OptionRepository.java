package com.zenil.quizassessmentmanagement.repository;

import com.zenil.quizassessmentmanagement.models.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends CrudRepository<Option, Long> {
}
