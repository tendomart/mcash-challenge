package com.mcash.auth.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "mormal_user")
public class NormalUser extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NormalUser(Long id, String username, String password, String passwordConfirm, Set roles) {
		super(id, username, password, passwordConfirm, roles);
		// TODO Auto-generated constructor stub
	}

}
