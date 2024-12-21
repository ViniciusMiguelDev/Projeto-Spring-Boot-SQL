package com.viniciusmiguel.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusmiguel.dev.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
