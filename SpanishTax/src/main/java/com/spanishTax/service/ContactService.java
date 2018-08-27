package com.spanishTax.service;

import java.util.List;

import com.spanishTax.model.ContactModel;

public interface ContactService {
	//Add New ContactData
	public abstract ContactModel addContactData(ContactModel contactModel);
	
	//List Users
	public abstract List<ContactModel> listAllContacts();
	
}
