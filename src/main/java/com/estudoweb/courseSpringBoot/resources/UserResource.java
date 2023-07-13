package com.estudoweb.courseSpringBoot.resources;

import com.estudoweb.courseSpringBoot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

//    @GetMapping
//    public ResponseEntity<User> findAll() {
//
//        return ResponseEntity.ok().body();
//    }

    /*@GetMapping("{/id}")
    public ResponseEntity<User> findById(@PathVariable long id) {
    return null;
    }*/

}
