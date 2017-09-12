package com.project1.SpringApp1.service;

import java.util.List;

import com.project1.SpringApp1.model.PersonData;

public interface UserService {
	public abstract PersonData addUser(PersonData personData); //From model>>PersonData for adding user data
	public abstract List<PersonData>listAllUsers();
}
