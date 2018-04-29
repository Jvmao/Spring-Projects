package com.udemy.backendNinja1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendNinja1.component.ContactConverter;
import com.udemy.backendNinja1.entity.Contact;
import com.udemy.backendNinja1.model.ContactModel;
import com.udemy.backendNinja1.repository.ContactRepository;
import com.udemy.backendNinja1.service.ContactService;

//1
@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {
	//3
	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	//4
	@Autowired
	@Qualifier("contactConverter") //Añadimos el componente desde la clase ContactConverter
	private ContactConverter contactConverter;
	//2
	@Override
	public ContactModel addContact(ContactModel contactModel) {
		//5
		Contact contact = contactRepository.save(contactConverter.convertContactModel2Contact(contactModel));
		//6
		return contactConverter.convertContact2ContactModel(contact);
	}


	//7 Métodos a Implementar desde la Clase ContactServiceImpl
	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		List<ContactModel> contactsModel = new ArrayList<ContactModel>();
		for(Contact contact:contacts) {
			contactsModel.add(contactConverter.convertContact2ContactModel(contact));
		}
		return contactsModel;
	}
	
	@Override
	public Contact findContactById(int id) {
		//8
		return contactRepository.findById(id);
	}
	
	//10
	public ContactModel findContactByIdModel(int id) {
		return contactConverter.convertContact2ContactModel(findContactById(id));
	}
	
	@Override
	public void removeContact(int id) {
		//9
		Contact contact = findContactById(id);
		if(null != contact) {
			contactRepository.delete(contact);
		}
	}


	public ContactModel findContactByModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
