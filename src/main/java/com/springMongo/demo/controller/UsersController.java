package com.springMongo.demo.controller;

import com.springMongo.demo.model.Users;
import com.springMongo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;


    @PostMapping("/create")
    public Mono<Users> createUser(@RequestBody Users users){
        return userService.create(users);
    }

    @GetMapping("/getByUsername/{username}")
    public Flux<Users> getByUsername(@PathVariable String username){
        return userService.getByUsername(username);
    }

    @GetMapping("/getAllUsers")
    public Flux<Users> getAll(){
        return userService.getAll();
    }

    @DeleteMapping("/deleteAll")
    public Mono<Void> deleteAll(){
        return userService.deleteAll();
    }

    @DeleteMapping("/delete/{username}")
    public Mono<Void> deleteByUsername(@PathVariable String username){
        return userService.deleteByUsername(username);
    }
}
