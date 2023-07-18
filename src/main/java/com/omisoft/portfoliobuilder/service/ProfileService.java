package com.omisoft.portfoliobuilder.service;

import java.util.List;

import com.omisoft.portfoliobuilder.dto.ProfileDTO;

public interface ProfileService {
	
	List<ProfileDTO> getProfiles();
	
	ProfileDTO getProfileById(Integer name);
	
	ProfileDTO createOrUpdateProfile(ProfileDTO profileDTO);

	void updateProfile(Integer id, ProfileDTO profileDTO);

	void deleteProfile(Integer id);

}

