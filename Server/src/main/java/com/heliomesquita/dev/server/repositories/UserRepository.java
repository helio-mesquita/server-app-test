package com.heliomesquita.dev.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heliomesquita.dev.server.entitites.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
