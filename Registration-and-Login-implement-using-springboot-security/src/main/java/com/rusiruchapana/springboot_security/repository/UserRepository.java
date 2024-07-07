package com.rusiruchapana.springboot_security.repository;

import com.rusiruchapana.springboot_security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
