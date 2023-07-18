package com.omisoft.portfoliobuilder.dto;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class ProfileDTO {

	private Integer id;
	@NotBlank
	private String name;
	@NotBlank
	private String email;
	@NotBlank
	private String mobileNumber;
	@NotBlank
	private String gender;
	private String city;
	private String country;
	private String collegeName;
	private String qualifiaction;
	private String university;
	private String percent1;
	private String start1;
	private String end1;
	private String qualification2;
	private String college2;
	private String university2;
	private String percent2;
	private String start2;
	private String end2;
	private String qualification3;
	private String college3;
	private String university3;
	private String percent3;
	private String start3;
	private String end3;
	private String projectname;
	private String description;
	private String prostart;
	private String proend;
	private String projectname2;
	private String description2;
	private String prostart2;
	private String proend2;
	@NotBlank
	private String skills;
	@NotBlank
	private String hobbies;
	private String objective;
	private String twitter;
	private List<String> skillsList;
	private List<String> hobbiesList;

}
