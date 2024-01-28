package com.CSafe.backend.classes;

import javax.persistence.*;

@Entity
public class Timestamp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int timestampId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	User userObj;
	
	long timeCreated;
	long lastAccessed;
	long lastModified;
	
	
	/* CONSTRUCTORS */
	
	public Timestamp() {
		this.userObj = null;
		this.timeCreated = 0;
		this.lastAccessed = 0;
		this.lastModified = 0;
	}
	
	public Timestamp(User userObj, long timeCreated, long lastAccessed, long lastModified) {
		this.userObj = userObj;
		this.timeCreated = timeCreated;
		this.lastAccessed = lastAccessed;
		this.lastModified = lastModified;
	}
	
	
	/* MEMBER FUNCTIONS */
	
//	@Override public String toString() {
//		
//	}
	
	
	/* GETTERS */
	
	public int getTimestampId() { return this.timestampId; }
	public User getUserObj() { return this.userObj; }
	public long getTimeCreated() { return this.timeCreated; }
	public long getLastAccessed() { return this.lastAccessed; }
	public long getLastModified() { return this.lastModified; }
	
	
	/* SETTERS */
	
	public void setTimestampId(int timestampId) { this.timestampId = timestampId; }
	public void setUserObj(User userObj) { this.userObj = userObj; }
	public void setTimeCreated(long timeCreated) { this.timeCreated = timeCreated; }
	public void setLastAccessed(long lastAccessed) { this.lastAccessed = lastAccessed; }
	public void setLastModified(long lastModified) { this.lastModified = lastModified; }
}
