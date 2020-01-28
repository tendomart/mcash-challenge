package com.mcash.auth.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "normal_user")
public class NormalUser extends User implements Serializable{

	public NormalUser(String username, String password, String passwordConfirm, Set roles) {
		super(username, password, passwordConfirm, roles);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
