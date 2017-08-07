package com.vaithi.restws.model;

import java.util.List;

public class Families {
	
	private List<Family> familyList;

	public Families() {
		super();
	}

	public Families(List<Family> familyList) {
		super();
		this.familyList = familyList;
	}

	public List<Family> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(List<Family> familyList) {
		this.familyList = familyList;
	}

	@Override
	public String toString() {
		return "Families [familyList=" + familyList + "]";
	}
	
	

}
