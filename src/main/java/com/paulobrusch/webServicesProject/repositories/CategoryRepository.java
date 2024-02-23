package com.paulobrusch.webServicesProject.repositories;

import com.paulobrusch.webServicesProject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
