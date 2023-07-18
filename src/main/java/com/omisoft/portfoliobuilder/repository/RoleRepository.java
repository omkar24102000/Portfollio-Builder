package com.omisoft.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omisoft.portfoliobuilder.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
