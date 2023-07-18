package com.omisoft.portfoliobuilder.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omisoft.portfoliobuilder.dto.ProfileDTO;
import com.omisoft.portfoliobuilder.entity.Profile;
import com.omisoft.portfoliobuilder.repository.ProfileRepository;
import com.omisoft.portfoliobuilder.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository profileRepository;

	@Override
	public List<ProfileDTO> getProfiles() {
		return profileRepository.findAll().stream().map(this::entityToDTO).collect(Collectors.toList());
	}

	@Override
	public ProfileDTO getProfileById(Integer id) {
		Optional<Profile> optionalProfile = profileRepository.findById(id);

		if (optionalProfile.isPresent()) {
			return entityToDTO(optionalProfile.get());
		} else {
			throw new RuntimeException("Profile Not Found with id:" + id);
		}
	}

	@Override
	@Transactional
	public ProfileDTO createOrUpdateProfile(ProfileDTO profileDTO) {

		Integer id = profileDTO.getId();
		if (Objects.isNull(id)) {
			Profile profile = dtoToEntity(profileDTO);
			return entityToDTO(profileRepository.save(profile));
		} else {
			Optional<Profile> optionalProfile = profileRepository.findById(id);
			if (optionalProfile.isPresent()) {
				Profile profile = optionalProfile.get();
				profile.setName(profileDTO.getName());
				profile.setEmail(profileDTO.getEmail());
				profile.setMobileNumber(profileDTO.getMobileNumber());
				profile.setGender(profileDTO.getGender());
				profile.setCity(profileDTO.getCity());
				profile.setCountry(profileDTO.getCountry());
				profile.setCollegeName(profileDTO.getCollegeName());
				profile.setQualifiaction(profileDTO.getQualifiaction());
				profile.setUniversity(profileDTO.getUniversity());
				profile.setPercent1(profileDTO.getPercent1());
				profile.setStart1(profileDTO.getStart1());
				profile.setEnd1(profileDTO.getEnd1());
				profile.setQualification2(profileDTO.getQualification2());
				profile.setCollege2(profileDTO.getCollege2());
				profile.setUniversity2(profileDTO.getUniversity2());
				profile.setPercent2(profileDTO.getPercent2());
				profile.setStart2(profileDTO.getStart2());
				profile.setEnd2(profileDTO.getEnd2());

				profile.setQualification3(profileDTO.getQualification3());
				profile.setCollege3(profileDTO.getCollege3());
				profile.setUniversity3(profileDTO.getUniversity3());
				profile.setPercent3(profileDTO.getPercent3());
				profile.setStart3(profileDTO.getStart3());
				profile.setEnd3(profileDTO.getEnd3());

				profile.setProjectname(profileDTO.getProjectname());
				profile.setDescription(profileDTO.getDescription());
				profile.setProstart(profileDTO.getProstart());
				profile.setProend(profileDTO.getProend());

				profile.setProjectname2(profileDTO.getProjectname2());
				profile.setDescription2(profileDTO.getDescription2());
				profile.setProstart2(profileDTO.getProstart2());
				profile.setProend2(profileDTO.getProend2());

				profile.setObjective(profileDTO.getObjective());
				profile.setTwitter(profileDTO.getTwitter());
				profile.setSkills(profileDTO.getSkills());
				profile.setHobbies(profileDTO.getHobbies());

				return entityToDTO(profile);
			} else {
				throw new RuntimeException("Profile Not Found with id:" + id);
			}
		}

	}

	@Override
	@Transactional
	public void updateProfile(Integer id, ProfileDTO profileDTO) {
		Profile profile = dtoToEntity(profileDTO);
		entityToDTO(profileRepository.save(profile));
	}

	@Override
	@Transactional
	public void deleteProfile(Integer id) {
		profileRepository.deleteById(id);
	}

	private ProfileDTO entityToDTO(Profile profile) {
		return new ProfileDTO(profile.getId(), profile.getName(), profile.getEmail(), profile.getMobileNumber(),
				profile.getGender(), profile.getCity(), profile.getCountry(), profile.getCollegeName(),
				profile.getQualifiaction(), profile.getUniversity(), profile.getPercent1(), profile.getStart1(),
				profile.getEnd1(), profile.getQualification2(), profile.getCollege2(), profile.getUniversity2(),
				profile.getPercent2(), profile.getStart2(), profile.getEnd2(), profile.getQualification3(),
				profile.getCollege3(), profile.getUniversity3(), profile.getPercent3(), profile.getStart3(),
				profile.getEnd3(), profile.getProjectname(), profile.getDescription(), profile.getProstart(),
				profile.getProend(), profile.getProjectname2(), profile.getDescription2(), profile.getProstart2(),
				profile.getProend2(), profile.getSkills(), profile.getHobbies(), profile.getObjective(),
				profile.getTwitter(), List.of(profile.getSkills().split(",")),
				List.of(profile.getHobbies().split(",")));
	}

	private Profile dtoToEntity(ProfileDTO profileDTO) {
		Profile profile = new Profile();
		profile.setName(profileDTO.getName());
		profile.setEmail(profileDTO.getEmail());
		profile.setMobileNumber(profileDTO.getMobileNumber());
		profile.setGender(profileDTO.getGender());
		profile.setCity(profileDTO.getCity());
		profile.setCountry(profileDTO.getCountry());
		profile.setCollegeName(profileDTO.getCollegeName());
		profile.setCollegeName(profileDTO.getCollegeName());
		profile.setQualifiaction(profileDTO.getQualifiaction());
		profile.setUniversity(profileDTO.getUniversity());
		profile.setPercent1(profileDTO.getPercent1());
		profile.setStart1(profileDTO.getStart1());
		profile.setEnd1(profileDTO.getEnd1());
		profile.setQualification2(profileDTO.getQualification2());
		profile.setCollege2(profileDTO.getCollege2());
		profile.setUniversity2(profileDTO.getUniversity2());
		profile.setPercent2(profileDTO.getPercent2());
		profile.setStart2(profileDTO.getStart2());
		profile.setEnd2(profileDTO.getEnd2());

		profile.setQualification3(profileDTO.getQualification3());
		profile.setCollege3(profileDTO.getCollege3());
		profile.setUniversity3(profileDTO.getUniversity3());
		profile.setPercent3(profileDTO.getPercent3());
		profile.setStart3(profileDTO.getStart3());
		profile.setEnd3(profileDTO.getEnd3());

		profile.setProjectname(profileDTO.getProjectname());
		profile.setDescription(profileDTO.getDescription());
		profile.setProstart(profileDTO.getProstart());
		profile.setProend(profileDTO.getProend());
		profile.setProjectname2(profileDTO.getProjectname2());
		profile.setDescription2(profileDTO.getDescription2());
		profile.setProstart2(profileDTO.getProstart2());
		profile.setProend2(profileDTO.getProend2());
		profile.setObjective(profileDTO.getObjective());
		profile.setTwitter(profileDTO.getTwitter());
		profile.setSkills(profileDTO.getSkills());
		profile.setHobbies(profileDTO.getHobbies());
		return profile;
	}

}
