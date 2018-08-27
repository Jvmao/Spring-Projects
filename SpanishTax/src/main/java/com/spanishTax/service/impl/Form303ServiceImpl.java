package com.spanishTax.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spanishTax.component.Form303Converter;
import com.spanishTax.entity.PersonData;
import com.spanishTax.model.PersonModel;
import com.spanishTax.repository.PersonRepository;
import com.spanishTax.service.Form303Service;

@Service("form303Impl")
public class Form303ServiceImpl implements Form303Service{
	
	@Autowired
	@Qualifier("personRepository") //From PersonRepository interface
	private PersonRepository personRepository;
	
	@Autowired
	@Qualifier("form303Converter") //From Form303Converter
	private Form303Converter form303Converter;

	//Method to add PersonData to DB
	@Override
	public PersonModel addPersonData(PersonModel personModel) {
		PersonData personData = personRepository.save(form303Converter.convertPersonModel2PersonData(personModel)); //Convert Model to Entity
		return form303Converter.convertPersonData2PersonModel(personData);
	}

	//Method to list all PersonData from DB
	@Override
	public List<PersonModel> listAllPersons(){
		List<PersonData> personData = personRepository.findAll();
		List<PersonModel> personModel = new ArrayList<PersonModel>();
		for(PersonData person: personData) {
			personModel.add(form303Converter.convertPersonData2PersonModel(person));
		}
		return personModel;
	}

	@Override
	public PersonData findContactById(int id) {
		return personRepository.findById(id);
	}

	@Override
	public void removeContact(int id) {
		PersonData personData = findContactById(id);
		if(personData != null) {
			personRepository.delete(personData); //Delete data from DB
		}else {
			System.out.println("Error Deleting User with ID = "+id+" from PersonServiceImpl");
		}
		
	}
}
