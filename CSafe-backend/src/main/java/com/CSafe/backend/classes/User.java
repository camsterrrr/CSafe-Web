package com.CSafe.backend.classes;

import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String email;
	private String masterPasswordHash;
	private String username;
	
	
	/* CONSTRUCTOR */
	
	public User() {
		this.email = null;
		this.masterPasswordHash = null;
		this.username = null;
	}
	
	public User(String email, String masterPasswordHash, String username) {
		this.email = email;
		this.masterPasswordHash = masterPasswordHash;
		this.username = username;
	}
	
	
	/* MEMBER FUNCTIONS */
	
	@Override public boolean equals(Object arbObj) {
		if (arbObj == null) { return false; }
		else if (getClass() != arbObj.getClass()) { return false; }
		else if (this == arbObj) { return true; }
		
		User userObj = (User) arbObj;
		if ((this.userId == userObj.userId) &&
				(this.email.equals(userObj.email)) &&
				(this.masterPasswordHash.equals(userObj.masterPasswordHash)) &&
				(this.username.equals(userObj.username))) {
			return true;
		} else { return false; }
	}
	
	@Override public String toString() {
		return "User {email=" + this.email + ", masterPasswordHash=" + masterPasswordHash + ", username=" + username +"}";
	}
	
	
	/* GETTERS */
	
	public int getUserId() { return this.userId; }
	public String getEmail() { return this.email; }
	public String getMasterPasswordHash() { return this.masterPasswordHash; }
	public String getUsername() { return this.username; }
	
	
	/* SETTERS */
	
	public void setUserId(int userId) { this.userId = userId; }
	public void setEmail(String email) { this.email = email; }
	public void setMasterPasswordHash(String masterPasswordHash) { this.masterPasswordHash = masterPasswordHash; }
	public void setUsername(String username) { this.username = username; }
}
