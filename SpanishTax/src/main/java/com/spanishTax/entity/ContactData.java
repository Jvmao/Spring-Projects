package com.spanishTax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Form_Data") //Define table
public class ContactData {
	// Columns to add in MySQL db
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column(name = "name")
	@NotNull
	String name;

	@Column(name = "telephone" ,nullable=false)
	@NotNull
	String tel;
	
	@Column(name = "email")
	@NotNull
	String email;
	
	@Column(name = "text")
	@NotNull
	String text;
	
	//Empty Constructor
	public ContactData() {}

	//Constructor using files
	public ContactData(int id, @NotNull String name, @NotNull String tel, @NotNull String email, @NotNull String text) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.text = text;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	//Object to String
	@Override
	public String toString() {
		return "ContactData [id=" + id + ", name=" + name + ", tel=" + tel + ", email=" + email + ", text=" + text
				+ "]";
	}
	
	
	
	
	

}
