package com.developerblog.app.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserDetailsRequestModel {
	@NotNull(message = "First name cannot be null")
	private String firstName;
	
	@NotNull(message = "Last name cannot be null")
	private String lastName;
	
	@Email(message = "Email name cannot be null")
	private String email;
	
	@NotNull(message = "Password name cannot be null")
	private String password;

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

}
