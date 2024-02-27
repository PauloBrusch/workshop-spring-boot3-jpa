package com.paulobrusch.webServicesProject.repositories;

import com.paulobrusch.webServicesProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
