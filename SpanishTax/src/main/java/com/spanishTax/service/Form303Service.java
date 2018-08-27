package com.spanishTax.service;

import java.util.List;

import com.spanishTax.entity.PersonData;
import com.spanishTax.model.PersonModel;

public interface Form303Service {
	//Add new Person
	public abstract PersonModel addPersonData(PersonModel personModel);
	
	//List all Persons from DataBase
	public abstract List<PersonModel> listAllPersons();
	
	//Find Users by ID
	public abstract PersonData findContactById(int id);
	//Remove Users from AddData.html
	public abstract void removeContact(int id);
}
