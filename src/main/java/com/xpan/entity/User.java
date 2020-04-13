package com.xpan.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author rtyagi
 * A User.
 */
@Entity
@Table(name = "user1")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 255)
	@Column(name = "email", length = 255)
	private String email;

	@Size(min = 1, max = 255)
	@Column(name = "first_name")
	private String firstName;

	@Size(min = 1, max = 255)
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_number")
	private Long phoneNumber;

	@Size(min = 1, max = 255)
	private String role;

	// remove
	public User() {
	}

	public User(Long id, @Size(max = 255) String email, @Size(min = 1, max = 255) String firstName,
			@Size(min = 1, max = 255) String lastName, Long phoneNumber, @Size(min = 1, max = 255) String role) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
	}

}
