package com.estudoweb.courseSpringBoot.resources;

import com.estudoweb.courseSpringBoot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user1 = new User(1L, "Maria", "maria@gmail.com", "123456789", "senha");
        return ResponseEntity.ok().body(user1);
    }

    /*@GetMapping("{/id}")
    public ResponseEntity<User> findById(@PathVariable long id) {
    return null;
    }*/

}
