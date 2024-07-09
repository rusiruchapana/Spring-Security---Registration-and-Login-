package com.rusiruchapana.springboot_security.repository;

import com.rusiruchapana.springboot_security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
