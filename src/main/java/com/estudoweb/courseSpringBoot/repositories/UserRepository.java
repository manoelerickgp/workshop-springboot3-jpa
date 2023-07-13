package com.estudoweb.courseSpringBoot.repositories;

import com.estudoweb.courseSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
