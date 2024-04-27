package com.joaolima.demo.repositories;

import com.joaolima.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
