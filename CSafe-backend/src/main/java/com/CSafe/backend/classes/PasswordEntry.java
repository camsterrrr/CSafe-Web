package com.CSafe.backend.classes;

import javax.persistence.*;

@Entity
public class PasswordEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passwordEntryId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private User userObj;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="timestampId")
	private Timestamp timestampObj;
	
	private String entryTitle;
	private String notes;
	private String plaintextPassword;
	private String url;
	private String username;
	
	
	/* CONSTRUCTORS */
	
	public PasswordEntry() {
		this.userObj = null;
		this.timestampObj = null;
		this.entryTitle = null;
		this.notes = null;
		this.plaintextPassword = null;
		this.url = null;
		this.username = null;
	}
	
	public PasswordEntry(User userObj, Timestamp timestampObj, String entryTitle, String notes, String plaintextPassword, String url, String username) {
		this.userObj = userObj;
		this.timestampObj = timestampObj;
		this.entryTitle = entryTitle;
		this.notes = notes;
		this.plaintextPassword = plaintextPassword;
		this.url = url;
		this.username = username;
	}
	
	
	/* MEMBER FUNCTIONS */
	
	@Override public boolean equals(Object arbObj) {
		if (arbObj == null) { return false; }
		else if (getClass() != arbObj.getClass()) { return false; }
		else if (this == arbObj) { return true; }
		
		PasswordEntry passwordEntryObj = (PasswordEntry) arbObj;
		if (this.passwordEntryId == passwordEntryObj.passwordEntryId &&
			    this.userObj.equals(passwordEntryObj.userObj) &&
			    this.timestampObj.equals(passwordEntryObj.timestampObj) &&
			    this.notes.equals(passwordEntryObj.notes) &&
			    this.plaintextPassword.equals(passwordEntryObj.plaintextPassword) &&
			    this.url.equals(passwordEntryObj.url) &&
			    this.username.equals(passwordEntryObj.username)) {
		    return true;
		} else {
		    return false;
		}

	}
	
	@Override public String toString() {
		return "PasswordEntry {userObj=" + this.userObj.toString() + ", timestampObj=" + this.timestampObj.toString() + 
				", entryTitle=" + this.entryTitle + ", notes=" + this.notes + ", plaintextPassword=" + this.plaintextPassword + 
				", url=" + this.url + ", username=" + this.username + "}";
	}
	
	
	/* GETTERS */
	
	public int getPasswordEntryId() { return this.passwordEntryId; }
	public User getUserObj() { return this.userObj; }
	public Timestamp getTimestampID() { return this.timestampObj; }
	public String getEntryTitle() { return this.entryTitle; }
	public String getNotes() { return this.notes; }
	public String getPlaintextPassword() { return this.plaintextPassword; }
	public String getURL() { return this.url; }
	public String getUsername() { return this.username; }
	
	
	/* SETTERS */
	
	public void setPasswordEntryId(int passwordEntryId) { this.passwordEntryId = passwordEntryId; }
	public void setUserObj(User userObj) { this.userObj = userObj; }
	public void setTimestampID(Timestamp timestampObj) { this.timestampObj = timestampObj; }
	public void setEntryTitle(String entryTitle) { this.entryTitle = entryTitle; }
	public void setNotes(String notes) { this.notes = notes; }
	public void setPlaintextPassword(String plaintextPassword) { this.plaintextPassword = plaintextPassword; }
	public void setURL(String url) { this.url = url; }
	public void setUsername(String username) { this.username = username; }
}
