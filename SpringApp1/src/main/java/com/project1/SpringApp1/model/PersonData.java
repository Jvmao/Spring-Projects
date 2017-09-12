package com.project1.SpringApp1.model;

public class PersonData {
	//Variables
	private int id;
	private String name;
	private String lastName;
	private String city;
	private String email;
	
	//Empty Constructor
	public PersonData() {}
	
	//Constructor
	public PersonData(int id, String name, String lastName, String city, String email) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.city = city;
		this.email = email;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//Methos to String
	@Override
	public String toString() {
		return "personData [id=" + id + ", name=" + name + ", lastName=" + lastName + ", city=" + city + ", email="
				+ email + "]";
	}
	
	
	
	
}
