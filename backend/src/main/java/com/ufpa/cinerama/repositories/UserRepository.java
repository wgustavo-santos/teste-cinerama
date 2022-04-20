package com.ufpa.cinerama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufpa.cinerama.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail (String email);
}
