package com.CSafe.backend.DTOs;

public class TimestampDTO {
	
	public int timestampId;
	public int userId;
	public long timeCreated;
	public long lastAccessed;
	public long lastModified;
	
	
	/* MEMBER FUNCTIONS */
	
	@Override public boolean equals(Object arbObj) {
		if (arbObj == null) { return false; }
		else if (getClass() != arbObj.getClass()) { return false; }
		else if (this == arbObj) { return true; }
		
		TimestampDTO timestampDTOObj = (TimestampDTO) arbObj;
		if (this.timestampId == timestampDTOObj.timestampId &&
			    this.userId == timestampDTOObj.userId &&
			    this.timeCreated == timestampDTOObj.timeCreated &&
			    this.lastAccessed == timestampDTOObj.lastAccessed &&
			    this.lastModified == timestampDTOObj.lastModified) {
		    return true;
		} else {
		    return false;
		}
	}
	
	@Override public String toString() {
		return "Timestamp {timestamp=" + this.userId + ", lastAccessed=" + this.lastAccessed + ", lastModified=" + this.lastModified +
				", timeCreated=" + this.timeCreated + "}";
	}
}
