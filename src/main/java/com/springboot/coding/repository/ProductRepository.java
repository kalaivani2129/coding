package com.springboot.coding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.coding.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
