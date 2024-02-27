package com.paulobrusch.webServicesProject.repositories;

import com.paulobrusch.webServicesProject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
