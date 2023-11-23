package com.sunan.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.courseSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
