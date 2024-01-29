package com.CSafe.backend.DTOs;

public class PasswordEntryDTO {
	
	public int passwordEntryId;
	public int userId;
	public int timestampId;
	public String entryTitle;
	public String notes;
	public String plaintextPassword;
	public String url;
	public String username;
	
	
	/* MEMBER FUNCTIONS */
	
	@Override public boolean equals(Object arbObj) {
		if (arbObj == null) { return false; }
		else if (getClass() != arbObj.getClass()) { return false; }
		else if (this == arbObj) { return true; }
		
		PasswordEntryDTO passwordEntryDTOObj = (PasswordEntryDTO) arbObj;
		if (this.passwordEntryId == passwordEntryDTOObj.passwordEntryId &&
			    this.userId == passwordEntryDTOObj.userId  &&
			    this.timestampId == passwordEntryDTOObj.timestampId &&
			    this.notes.equals(passwordEntryDTOObj.notes) &&
			    this.plaintextPassword.equals(passwordEntryDTOObj.plaintextPassword) &&
			    this.url.equals(passwordEntryDTOObj.url) &&
			    this.username.equals(passwordEntryDTOObj.username)) {
		    return true;
		} else {
		    return false;
		}

	}
	
	@Override public String toString() {
		return "PasswordEntry {userObj=" + this.userId + ", timestampObj=" + this.timestampId + ", entryTitle=" + 
				this.entryTitle + ", notes=" + this.notes + ", plaintextPassword=" + this.plaintextPassword + 
				", url=" + this.url + ", username=" + this.username + "}";
	}
}
