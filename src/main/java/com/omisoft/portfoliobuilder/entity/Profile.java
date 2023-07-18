package com.omisoft.portfoliobuilder.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "profile")
@Getter
@Setter
@NoArgsConstructor
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String email;

	@Column(name = "mobile_number")
	private String mobileNumber;

	private String gender;

	private String city;
	private String country;

	@Column(name = "college_name")
	private String collegeName;

	private String qualifiaction;

	private String university;

	private String percent1;

	private String start1;

	private String end1;

	@Column(name = "qualification2")
	private String qualification2;

	private String college2;

	private String university2;

	private String percent2;

	private String start2;

	private String end2;

	@Column(name = "qualification3")
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

	private String objective;
	private String twitter;

	private String skills;
	private String hobbies;
}
