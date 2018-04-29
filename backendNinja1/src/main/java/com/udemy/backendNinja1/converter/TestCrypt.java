package com.udemy.backendNinja1.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCrypt {

	public static void main(String[] args) {
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		System.out.println(pe.encode("user")); //Introducimos el password que queremos
		//Run As>>Java Aplication y genera la contraseña encriptada en la consola y lo introducimos en la BBDD MySQL
	}

}
