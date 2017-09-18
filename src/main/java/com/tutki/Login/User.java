package com.tutki.Login;

public class User {
	private int id;
	private String userName, lastName, address, birthDate;

	public User(){}

	public User(int id, String userName, String lastName, String address, String birthDate) {
		this.id = id;
		this.userName = userName;
		this.lastName = lastName;
		this.address = address;
		this.birthDate = birthDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
		
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}



}