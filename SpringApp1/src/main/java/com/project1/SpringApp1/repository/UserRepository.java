package com.project1.SpringApp1.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.SpringApp1.entity.User;

//1
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Serializable>{
		//2 Method from Class UserServiceImpl
		public abstract User findById(int id);
}
