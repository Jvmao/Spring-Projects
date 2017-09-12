package com.project1.SpringApp1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project1.SpringApp1.component.UserConverter;
import com.project1.SpringApp1.entity.User;
import com.project1.SpringApp1.model.PersonData;
import com.project1.SpringApp1.repository.UserRepository;
import com.project1.SpringApp1.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository; //From repository>>UserRepository
	
	@Autowired
	@Qualifier("userConverter")
	private UserConverter userConverter; //From component>>UserConverter
	
	@Override
	public PersonData addUser(PersonData personData) {
		User user = userRepository.save(userConverter.convertPersonData2User(personData));
		return userConverter.convertUser2PersonData(user);
	}

	@Override
	public List<PersonData> listAllUsers() {
		List<User> users = userRepository.findAll();
		List<PersonData> personsData = new ArrayList<PersonData>();
		for(User user:users) {
			personsData.add(userConverter.convertUser2PersonData(user));
		}
		return personsData;
	}

}
