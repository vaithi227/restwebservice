package com.vaithi.restws.model;

public class House {
	
	private String houseName;
	private String location;
	private Families families;
	private RemainingChildList remainChildList;
	public House() {
		super();
	}
	public House(String houseName, String location, Families families, RemainingChildList remainChildList) {
		super();
		this.houseName = houseName;
		this.location = location;
		this.families = families;
		this.remainChildList = remainChildList;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Families getFamilies() {
		return families;
	}
	public void setFamilies(Families families) {
		this.families = families;
	}
	public RemainingChildList getRemainChildList() {
		return remainChildList;
	}
	public void setRemainChildList(RemainingChildList remainChildList) {
		this.remainChildList = remainChildList;
	}
	@Override
	public String toString() {
		return "House [houseName=" + houseName + ", location=" + location + ", families=" + families
				+ ", remainChildList=" + remainChildList + "]";
	}
	
	

}
