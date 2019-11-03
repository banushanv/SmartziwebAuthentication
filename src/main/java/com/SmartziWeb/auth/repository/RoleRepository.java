package com.SmartziWeb.auth.repository;

import com.SmartziWeb.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
