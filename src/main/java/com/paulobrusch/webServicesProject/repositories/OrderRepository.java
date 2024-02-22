package com.paulobrusch.webServicesProject.repositories;

import com.paulobrusch.webServicesProject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
