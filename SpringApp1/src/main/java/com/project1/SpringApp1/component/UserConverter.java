package com.project1.SpringApp1.component;

import org.springframework.stereotype.Component;
import com.project1.SpringApp1.entity.User;
import com.project1.SpringApp1.model.PersonData;

//1
@Component("userConverter")
public class UserConverter {
	
	//From entity class User and we create a relation with model>>PersonData
	public User convertPersonData2User(PersonData personData) {
		User user = new User();
		user.setCity(personData.getCity());
		user.setLastname(personData.getLastName());
		user.setName(personData.getName());
		user.setEmail(personData.getEmail());
		return user;
	}
	
	//From model>>class PersonData and we create a relation with entity>>User
	public PersonData convertUser2PersonData(User user) {
		PersonData personData = new PersonData();
		personData.setCity(user.getCity());
		personData.setLastName(user.getLastname());
		personData.setName(user.getName());
		personData.setEmail(user.getEmail());
		return personData;
	}
}
