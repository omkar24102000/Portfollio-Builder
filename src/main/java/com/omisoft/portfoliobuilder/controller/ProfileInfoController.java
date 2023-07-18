package com.omisoft.portfoliobuilder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omisoft.portfoliobuilder.dto.ProfileDTO;
import com.omisoft.portfoliobuilder.service.ProfileService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/profile")
public class ProfileInfoController {

	@Autowired
	ProfileService profileService;

	@GetMapping
	public String getProfiles(Model model) {

		model.addAttribute("profiles", profileService.getProfiles());

		return "profile";
	}

	@GetMapping("/form")
	public String showForm(Model model) {
		ProfileDTO profileDTO = new ProfileDTO();
		model.addAttribute("profileDTO", profileDTO);
		model.addAttribute("graduationList", List.of("B.E", "BSCIT", "BCA"));
		model.addAttribute("graduationList2", List.of("HSC", "Diploma"));
		model.addAttribute("graduationList3", List.of("SSC", "CBSE"));

		return "form";

	}

	@GetMapping("/display")
	public String showDisplayPage(Model model) {
		ProfileDTO dto = new ProfileDTO();
		dto.setName("Omkar Barve");
		dto.setEmail("omkarbarve0101@gmail.com");
		dto.setMobileNumber("9136205275");
		dto.setGender("Male");
		dto.setCity("Mumbai");
		dto.setCountry("India");
		dto.setQualifiaction("BE");
		dto.setCollegeName("Sharad Chandra Pawar College Of Engineering, Pune ");
		dto.setUniversity("Computer Engineering");
		dto.setPercent1("78");
		dto.setStart1("AUG 2019");
		dto.setEnd1("Aug 2022");
		dto.setQualification2("Diploma");
		dto.setCollege2("Vidyalankar Institute");
		dto.setUniversity2("Computer Engineering");
		dto.setPercent2("63");
		dto.setStart2("JUL 2016");
		dto.setEnd2("JUL-2019");
		dto.setQualification3("Class X");
		dto.setCollege3("Balmohan Vidya mandir");
		dto.setUniversity3("Secondary School Certificate");
		dto.setPercent3("76");
		dto.setStart3("JUN 2015");
		dto.setEnd3("JUN 2016");

		dto.setProjectname("Employee Tracker");
		dto.setDescription(
				"This is Desktop application which can be used to manage the employee information, helpful for organizations to track this information easily");
		dto.setProstart("JUN 2022");
		dto.setProend("JUL 2022");

		dto.setProjectname2("AI Chatbot");
		dto.setDescription2(
				"This is Artificial Intelligence Chat-bot which can be used for day to day transportation system. This Chat-bot help people to their destination, Bus Number,Route and arrival timing at new places.");
		dto.setProstart2("OCT 2022");
		dto.setProend2("APR 2022");

		dto.setSkillsList(List.of("HTML", "CSS", "JQuery", "JAVA J2SE", "JAVA J2EE", "Spring Boot", "JPA/Hibernet"));
		dto.setHobbiesList(List.of("Sports", "Movies", "Video Games"));

		dto.setObjective(
				"To pursue a highly rewarding career, seeking for a job in challenging and healthy work environment demanding all my skills and efforts to explore and adapt myself in different fields and realize my potential where I get the opportunity for continuous learning. To serve the nation in technical advancement. ");
		dto.setTwitter("@Twitter");
		model.addAttribute("profile", dto);

		return "display";
	}

	@PostMapping
	public String createProfile(@Valid @ModelAttribute ProfileDTO profileDTO, Model model) {
		ProfileDTO profile = profileService.createOrUpdateProfile(profileDTO);
		model.addAttribute("profile", profile);
		return "display";
	}

}
