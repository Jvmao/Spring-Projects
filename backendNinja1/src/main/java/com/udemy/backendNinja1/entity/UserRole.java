package com.udemy.backendNinja1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user_role",uniqueConstraints = @UniqueConstraint(
		columnNames = {"role","username"}))
//Clase para almacenar los roles del usuario//
public class UserRole {
	@Id
	@GeneratedValue
	@Column(name = "user_role_id",unique=true, nullable=false)
	private Integer userRoleId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "username",nullable=false)
	private User user;
	
	@Column(name="role",nullable=false,length=45)
	private String role;
	
	
	//Generamos los Getters, Setters y Constructores//
	
	//Añadimos el Constructor Vacío
		public UserRole() {
		}
	//Añadimos el Constructor
	public UserRole(Integer userRoleId, User user, String role) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
		this.role = role;
	}

	//Getters y Setters//
	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
