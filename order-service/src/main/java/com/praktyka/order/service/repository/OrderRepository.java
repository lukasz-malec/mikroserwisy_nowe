package com.praktyka.order.service.repository;

import com.praktyka.order.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {
}
