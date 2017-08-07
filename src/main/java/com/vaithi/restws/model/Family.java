package com.vaithi.restws.model;

import java.util.List;

public class Family {
	
	private int parentID;
	private ChildList childList;

	public Family() {
		super();
	}

	public Family(int parentID, ChildList childList) {
		super();
		this.parentID = parentID;
		this.childList = childList;
	}

	public int getParentID() {
		return parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public ChildList getChildList() {
		return childList;
	}

	public void setChildList(ChildList childList) {
		this.childList = childList;
	}

	@Override
	public String toString() {
		return "Family [parentID=" + parentID + ", childList=" + childList + "]";
	}






}
