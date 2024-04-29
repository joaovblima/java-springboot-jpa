package com.joaolima.demo.repositories;

import com.joaolima.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
