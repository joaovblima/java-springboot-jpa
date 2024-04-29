package com.joaolima.demo.repositories;

import com.joaolima.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
