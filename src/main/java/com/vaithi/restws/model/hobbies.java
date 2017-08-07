package com.vaithi.restws.model;

public class hobbies {
	
	private int hobbyId;
	private String hobbyName;
	
	public hobbies(int hobbyId, String hobbyName) {
		super();
		this.hobbyId = hobbyId;
		this.hobbyName = hobbyName;
	}
	public int getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(int hobbyId) {
		this.hobbyId = hobbyId;
	}
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	@Override
	public String toString() {
		return "hobbies [hobbyId=" + hobbyId + ", hobbyName=" + hobbyName + "]";
	}
	

	
	

	
	

}
