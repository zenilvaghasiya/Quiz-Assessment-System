package com.zenil.quizassessmentmanagement.repository;

import com.zenil.quizassessmentmanagement.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
}
