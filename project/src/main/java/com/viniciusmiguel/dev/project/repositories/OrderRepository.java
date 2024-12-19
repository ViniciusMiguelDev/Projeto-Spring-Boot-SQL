package com.viniciusmiguel.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusmiguel.dev.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
