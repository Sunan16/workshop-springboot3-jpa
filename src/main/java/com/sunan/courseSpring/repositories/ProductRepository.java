package com.sunan.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.courseSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
