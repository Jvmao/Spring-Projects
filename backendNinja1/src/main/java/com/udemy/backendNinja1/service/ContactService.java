package com.udemy.backendNinja1.service;

import java.util.List;

import com.udemy.backendNinja1.entity.Contact;
import com.udemy.backendNinja1.model.ContactModel;

//1
public interface ContactService {
	public abstract ContactModel addContact(ContactModel contactModel);
	
	//2
	public abstract List<ContactModel> listAllContacts();
	
	public abstract Contact findContactById(int id);
	
	public abstract void removeContact(int id);
	
	//3
	public abstract ContactModel findContactByIdModel(int id);
}
