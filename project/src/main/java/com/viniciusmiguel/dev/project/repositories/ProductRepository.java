package com.viniciusmiguel.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusmiguel.dev.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
