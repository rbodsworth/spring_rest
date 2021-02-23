package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
