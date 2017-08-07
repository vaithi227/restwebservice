package com.vaithi.restws.model;

import java.util.List;

public class RemainingChildList {
	private List<String> childID;

	public RemainingChildList() {
		super();
	}

	public RemainingChildList(List<String> childID) {
		super();
		this.childID = childID;
	}

	public List<String> getChildID() {
		return childID;
	}

	public void setChildID(List<String> childID) {
		this.childID = childID;
	}

	@Override
	public String toString() {
		return "RemainingChildList [childID=" + childID + "]";
	}


	
	

}
