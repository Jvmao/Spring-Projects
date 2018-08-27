package com.spanishTax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spanishTax.component.ContactConverter;
import com.spanishTax.entity.ContactData;
import com.spanishTax.model.ContactModel;
import com.spanishTax.repository.ContactRepository;
import com.spanishTax.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService{

	@Autowired
	@Qualifier("contactRepository") //From ContactRepository interface
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter") //From ContactConverter
	private ContactConverter contactConverter;
	
	// Method to add ContactData to DB
	@Override
	public ContactModel addContactData(ContactModel contactModel) {
		ContactData contactData = contactRepository.save(contactConverter.convertContactModel2ContactData(contactModel));
		return contactConverter.convertContactData2ContactModel(contactData);
	}
	

	@Override
	public List<ContactModel> listAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}
}
