package com.spanishTax.model;

//ContactModel Object
public class ContactModel {
	//Variables
	private int id;
	private String name;
	private String tel;
	private String email;
	private String text;
	
	//Empty Constructor
	public ContactModel() {}

	//Constructor Using Files
	public ContactModel(int id, String name, String tel, String email, String text) {
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
		return "ContactModel [id=" + id + ", name=" + name + ", telephone=" + tel + ", email=" + email + ", text="
				+ text + "]";
	}

}
