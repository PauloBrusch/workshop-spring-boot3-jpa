package com.paulobrusch.webServicesProject.repositories;

import com.paulobrusch.webServicesProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
