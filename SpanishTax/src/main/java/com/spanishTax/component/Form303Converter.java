package com.spanishTax.component;

import org.springframework.stereotype.Component;

import com.spanishTax.entity.PersonData;
import com.spanishTax.model.PersonModel;

@Component("form303Converter")
public class Form303Converter {
	
	//PersonData from Entity
	public PersonData convertPersonModel2PersonData(PersonModel personModel) {
		PersonData personData = new PersonData();
		personData.setId(personModel.getId());
		personData.setYear(personModel.getYear());
		personData.setPeriod(personModel.getPeriod());
		personData.setNif(personModel.getNif());
		personData.setName(personModel.getName());
		personData.setAccured(personModel.getAccured());
		personData.setDeduction(personModel.getDeduction());
		personData.setTotal(personModel.getTotal());
		return personData;	
	}
	
	//Person Model from Model
	public PersonModel convertPersonData2PersonModel(PersonData personData) {
		PersonModel personModel = new PersonModel();
		personModel.setId(personData.getId());
		personModel.setYear(personData.getYear());
		personModel.setPeriod(personData.getPeriod());
		personModel.setNif(personData.getNif());
		personModel.setName(personData.getName());
		personModel.setAccured(personData.getAccured());
		personModel.setDeduction(personData.getDeduction());
		personModel.setTotal(personData.getTotal());
		return personModel;
		
	}

}
