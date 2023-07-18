package com.omisoft.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omisoft.portfoliobuilder.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
