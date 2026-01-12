package com.Davi.demo.repositories;

import com.Davi.demo.entities.Order;
import com.Davi.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
