package com.zenil.quizassessmentmanagement.repository;

import com.zenil.quizassessmentmanagement.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
