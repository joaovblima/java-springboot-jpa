package com.joaolima.demo.repositories;

import com.joaolima.demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
