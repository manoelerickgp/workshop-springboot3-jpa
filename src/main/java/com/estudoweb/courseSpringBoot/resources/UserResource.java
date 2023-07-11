package com.estudoweb.courseSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> findAll() {
        String test = "testando metodo get, value, falou, estamos juntos, legal...";
        return ResponseEntity.ok().body(test);
    }
}
