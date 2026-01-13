package com.Davi.demo.repositories;

import com.Davi.demo.entities.Category;
import com.Davi.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
