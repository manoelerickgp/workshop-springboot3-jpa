package com.estudoweb.courseSpringBoot.repositories;

import com.estudoweb.courseSpringBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
