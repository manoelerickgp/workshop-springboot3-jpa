package com.estudoweb.courseSpringBoot.repositories;

import com.estudoweb.courseSpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
