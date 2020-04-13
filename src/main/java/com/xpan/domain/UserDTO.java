package com.xpan.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * @author rtyagi
 *
 */
public class UserDTO {

    private Long id;

    @Email
    @Size(min = 5, max = 255)
    private String email;
    
    @Size(min = 0, max = 255)
    private String firstName;
    
    @Size(min = 0, max = 255)
    private String lastName;
    
    @Size(min = 0, max = 255)
    private String role;
    
    private Long phoneNumber;

    
    
	public UserDTO() {
		super();
	}



	public UserDTO(Long id, @Email @Size(min = 5, max = 255) String email, @Size(min = 0, max = 255) String firstName,
			@Size(min = 0, max = 255) String lastName, @Size(min = 0, max = 255) String role, Long phoneNumber) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.phoneNumber = phoneNumber;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
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
		return "UserDTO [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", role=" + role + ", phoneNumber=" + phoneNumber + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
    
    
    
    

}
