package com.mcash.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "customer")
public class Customer {

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long id, String first_name, String last_name, String gender, Date date, String city,
			String id_number, Date id_type, String country, String marital_status) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.date = date;
		this.city = city;
		this.id_number = id_number;
		this.id_type = id_type;
		this.country = country;
		this.marital_status = marital_status;
	}
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ColumnDefault(value = "1")
	private Long id;
	@Column(name = "fname", unique = true)
	private String first_name;
	@Column(name = "lname", unique = true)
	private String last_name;
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "date")
	private Date date;
	@Column(name = "city")
	private String city;
	@Column(name = "id_number", unique = true)
	private String id_number;
	
	@Column(name = "id_type")
	private Date id_type;
	@Column(name = "country")
	private String country;
	@Column(name = "marital_status")
	private String marital_status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public Date getId_type() {
		return id_type;
	}
	public void setId_type(Date id_type) {
		this.id_type = id_type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	
}
