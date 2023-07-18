package com.omisoft.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omisoft.portfoliobuilder.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
