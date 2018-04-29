package com.udemy.backendNinja1.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendNinja1.entity.Contact;
//1
@Repository("contactRepository")
public interface ContactRepository extends JpaRepository<Contact,Serializable> {
	//2 Método para la Clase ContactServiceImpl
	public abstract Contact findById(int id);
}
