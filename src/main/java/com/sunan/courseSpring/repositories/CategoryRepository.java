package com.sunan.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.courseSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
