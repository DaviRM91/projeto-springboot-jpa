package com.Davi.demo.repositories;

import com.Davi.demo.entities.OrderItem;
import com.Davi.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
