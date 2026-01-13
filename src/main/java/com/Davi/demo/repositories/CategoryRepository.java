package com.Davi.demo.repositories;

import com.Davi.demo.entities.Category;
import com.Davi.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
