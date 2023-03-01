package com.md.exercises.exception.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class Error {
    private HttpStatus status;
    private String message;
}
