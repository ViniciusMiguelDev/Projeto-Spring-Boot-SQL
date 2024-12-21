package com.viniciusmiguel.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusmiguel.dev.project.entities.OrderItem;
import com.viniciusmiguel.dev.project.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
