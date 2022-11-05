package com.jspider.springwebpro.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = AppConstants.USER_TABLE_NAME)
public class User implements Serializable {
	
	public User() {
		System.out.println("User object is Created");
	}

//	@GenericGenerator(name="auto", strategy = "increment")
//	@GeneratedValue(generator = "auto")
//	private Integer id;

	private String name;

	@Id
	private String email;

	private String password;

	private String contact;

	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "User [ name=" + name + ", email=" + email + ", password=" + password + ", contact=" + contact
				+ ", country=" + country + "]";
	}

}
