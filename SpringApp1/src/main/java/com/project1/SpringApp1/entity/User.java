package com.project1.SpringApp1.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	//Add annotations for Hibernate and create table and columns in MySQL
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	@Column(name="lastname")
	private String lastname;
	@Column(name="city")
	private String city;
	@Column(name="email")
	private String email;
	
	//Empty Constructor
	public User() {}
	
	//Constructor
	public User(int id, String name, String lastname, String city, String email) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.city = city;
		this.email = email;
	}
	//Generate Getters and Setters
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	
	
	
}
