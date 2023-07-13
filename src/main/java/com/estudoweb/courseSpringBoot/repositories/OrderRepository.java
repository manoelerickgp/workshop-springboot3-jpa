package com.estudoweb.courseSpringBoot.repositories;

import com.estudoweb.courseSpringBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
