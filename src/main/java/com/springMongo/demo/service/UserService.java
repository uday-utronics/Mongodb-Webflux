package com.springMongo.demo.service;

import com.springMongo.demo.model.Users;
import com.springMongo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public Mono<Users> create(Users users) {
        return userRepository.save(users);
    }

    public Flux<Users> getAll(){
        return userRepository.findAll();
    }

    public Flux<Users> getByUsername(String username) {
        return userRepository.findByUsernameEquals(username);
    }

    public Mono<Void> deleteAll() {
        return userRepository.deleteAll();
    }

    public Mono<Void> deleteByUsername(String username) {
        return userRepository.deleteByUsernameEquals(username);
    }

}
