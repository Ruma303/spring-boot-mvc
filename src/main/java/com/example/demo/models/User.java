package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	@JsonProperty("primoNome")
	private String name;
	
	@JsonProperty("Cognome")
	private String lastName;
	
	public User() {
		super();
	}
	
	public User(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + "]";
	}

}
