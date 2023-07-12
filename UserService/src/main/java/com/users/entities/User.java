package com.users.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;


@Entity
@Data
public class User {

	@Id
	private String userId;
	private String name;
	private String email;
	private String password;
	private String about;
	@Transient
	List<Rating> ratings;
}
