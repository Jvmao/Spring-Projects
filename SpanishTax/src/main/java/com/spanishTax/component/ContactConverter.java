package com.spanishTax.component;

import org.springframework.stereotype.Component;

import com.spanishTax.entity.ContactData;
import com.spanishTax.model.ContactModel;


@Component("contactConverter")
public class ContactConverter {

	//ContactData from Entity
	public ContactData convertContactModel2ContactData(ContactModel contactModel) {
		ContactData contactData = new ContactData();
		contactData.setId(contactModel.getId());
		contactData.setName(contactModel.getName());
		contactData.setTel(contactModel.getTel());
		contactData.setEmail(contactModel.getEmail());
		contactData.setText(contactModel.getText());
		return contactData;	
	}
	
	//ContactModel from Model
	public ContactModel convertContactData2ContactModel(ContactData contactData) {
		ContactModel contactModel = new ContactModel();
		contactModel.setId(contactData.getId());
		contactModel.setName(contactData.getName());
		contactModel.setTel(contactData.getTel());
		contactModel.setEmail(contactData.getEmail());
		contactModel.setText(contactData.getText());
		return contactModel;	
	}
}
