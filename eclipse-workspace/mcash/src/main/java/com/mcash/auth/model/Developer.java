package com.mcash.auth.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
@Entity
@Table(name = "developer")
public class Developer extends User implements Serializable{

	public Developer( String username, String password, String passwordConfirm, Set roles) {
		super(id, username, password, passwordConfirm, roles);
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ColumnDefault(value = "1")
	private Long id;
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
}
