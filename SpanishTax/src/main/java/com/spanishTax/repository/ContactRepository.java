package com.spanishTax.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spanishTax.controller.Contact;
import com.spanishTax.entity.ContactData;


@Repository("contactRepository")
public interface ContactRepository extends JpaRepository<ContactData,Serializable>{

}