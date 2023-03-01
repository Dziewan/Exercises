package com.md.exercises.exception;

import com.md.exercises.exception.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExercisesExceptionHandler {

    @ExceptionHandler({NotImplementedException.class})
    public ResponseEntity<?> handle(final NotImplementedException exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Error.builder()
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .message(exception.getMessage())
                        .build());
    }
}
