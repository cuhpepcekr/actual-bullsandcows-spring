package com.cuhpepcekr.bullsandcows.repository;

import com.cuhpepcekr.bullsandcows.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
