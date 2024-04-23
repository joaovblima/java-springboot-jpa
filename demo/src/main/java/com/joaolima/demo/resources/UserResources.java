package com.joaolima.demo.resources;

import com.joaolima.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User usr = new User(1L, "Maria", "maria@gmail.com", "982123123", "123452");
        return ResponseEntity.ok().body(usr);
    }


}
