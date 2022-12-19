package com.springMongo.demo.repository;

import com.springMongo.demo.model.Users;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<Users, String> {

    Flux<Users> findByUsernameEquals(String username);

    Mono<Void> deleteByUsernameEquals(String username);
}
