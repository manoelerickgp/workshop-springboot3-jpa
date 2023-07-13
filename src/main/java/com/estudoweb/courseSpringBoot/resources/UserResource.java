package com.estudoweb.courseSpringBoot.resources;

import com.estudoweb.courseSpringBoot.entities.User;
import com.estudoweb.courseSpringBoot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findbyId(@PathVariable Long id) {
       User obj = service.findbyId(id);
       return ResponseEntity.ok().body(obj);
    }

}
