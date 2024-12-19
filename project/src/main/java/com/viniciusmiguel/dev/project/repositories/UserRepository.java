package com.viniciusmiguel.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusmiguel.dev.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
