package com.udemy.backendNinja1.component;

import org.springframework.stereotype.Component;

import com.udemy.backendNinja1.entity.Contact;
import com.udemy.backendNinja1.model.ContactModel;

//1
@Component("contactConverter")
public class ContactConverter {
	//2
	public Contact convertContactModel2Contact(ContactModel contactModel) {
		//4
		Contact contact = new Contact();
		contact.setCity(contactModel.getCity());
		contact.setFirstname(contactModel.getFirstname());
		contact.setId(contactModel.getId());
		contact.setLastname(contactModel.getLastname());
		contact.setTelephone(contactModel.getTelephone());
		return contact;
	}
	
	//3
	public ContactModel convertContact2ContactModel (Contact contact) {
		//5
		ContactModel contactModel = new ContactModel();
		contactModel.setCity(contact.getCity());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setId(contact.getId());
		contactModel.setLastname(contact.getLastname());
		contactModel.setTelephone(contact.getTelephone());
		return contactModel;
	}
}
