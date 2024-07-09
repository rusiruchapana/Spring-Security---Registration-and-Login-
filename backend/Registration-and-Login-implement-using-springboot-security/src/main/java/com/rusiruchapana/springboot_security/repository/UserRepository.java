package com.rusiruchapana.springboot_security.repository;

import com.rusiruchapana.springboot_security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
