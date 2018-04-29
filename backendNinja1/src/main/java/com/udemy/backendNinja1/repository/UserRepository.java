package com.udemy.backendNinja1.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendNinja1.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Serializable>{
	//Método para buscar usuarios por Nombre
	public abstract User findByUsername(String username);
}
