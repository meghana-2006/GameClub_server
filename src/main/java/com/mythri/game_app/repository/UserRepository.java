package com.mythri.game_app.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mythri.game_app.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
