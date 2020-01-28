package com.mcash.auth.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "developer")
public class Developer extends User implements Serializable{

	public Developer(Long id, String username, String password, String passwordConfirm, Set roles) {
		super(id, username, password, passwordConfirm, roles);
		// TODO Auto-generated constructor stub
	}

}
