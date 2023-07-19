package com.estudoweb.courseSpringBoot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found exception. Id " + id);
    }
}
