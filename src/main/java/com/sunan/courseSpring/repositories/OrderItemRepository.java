package com.sunan.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.courseSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
