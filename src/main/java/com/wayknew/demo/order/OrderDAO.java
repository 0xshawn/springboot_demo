package com.wayknew.demo.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrderDAO extends JpaRepository<Order,Long> {
    Order findByOrderId(Long orderId);
}
