package com.eyup.jpaquery.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "users")
@Data
@NoArgsConstructor
public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String identityNumber;
	 
	public User(String firstName, String lastName, String email, String identityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.identityNumber = identityNumber;
	}
	 
	 
}
