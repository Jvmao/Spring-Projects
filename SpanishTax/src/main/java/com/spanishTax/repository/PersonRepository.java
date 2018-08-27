package com.spanishTax.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spanishTax.entity.PersonData;

@Repository("personRepository")
public interface PersonRepository extends JpaRepository<PersonData,Serializable>{
		public abstract PersonData findById(int id);
}
