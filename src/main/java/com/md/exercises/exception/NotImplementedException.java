package com.md.exercises.exception;

public class NotImplementedException extends RuntimeException {
    public NotImplementedException() {
        super("Metoda nie została jeszcze zaimplementowana");
    }
}
