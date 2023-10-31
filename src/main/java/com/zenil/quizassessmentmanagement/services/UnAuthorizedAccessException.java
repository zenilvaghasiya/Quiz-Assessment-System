package com.zenil.quizassessmentmanagement.services;

public class UnAuthorizedAccessException extends Exception {
    public UnAuthorizedAccessException(String errorMessage) {
        super(errorMessage);
    }
}
