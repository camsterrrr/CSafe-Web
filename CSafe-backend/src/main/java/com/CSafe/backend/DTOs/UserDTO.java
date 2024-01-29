package com.CSafe.backend.DTOs;

public class UserDTO {
	
	public int userId;
	public String email;
	public String masterPasswordHash;
	public String username;
	
	
	/* MEMBER FUNCTIONS */
	
	@Override public boolean equals(Object arbObj) {
		if (arbObj == null) { return false; }
		else if (getClass() != arbObj.getClass()) { return false; }
		else if (this == arbObj) { return true; }
		
		UserDTO userDTOObj = (UserDTO) arbObj;
		if ((this.userId == userDTOObj.userId) &&
				(this.email.equals(userDTOObj.email)) &&
				(this.masterPasswordHash.equals(userDTOObj.masterPasswordHash)) &&
				(this.username.equals(userDTOObj.username))) {
			return true;
		} else { return false; }
	}
	
	@Override public String toString() {
		return "User {email=" + this.email + ", masterPasswordHash=" + masterPasswordHash + ", username=" + username +"}";
	}
}
