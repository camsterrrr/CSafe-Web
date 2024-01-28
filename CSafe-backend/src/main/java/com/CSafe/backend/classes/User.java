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
	
//	@Override toString() {
//		
//	}
	
	
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
