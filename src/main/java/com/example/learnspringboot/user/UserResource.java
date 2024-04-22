package com.example.learnspringboot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
// THIS IS THE CONTROL FILE
// This is a controller File
// In this file we have the routes with we can work
// In this file we call the service.
@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retriveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/getOne/{id}")
    public User retriveOneUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @GetMapping("/users/createOne")
    public ResponseEntity<Object> createOneUser(@RequestBody User userData) {
        User sevedUser = service.save(userData);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
