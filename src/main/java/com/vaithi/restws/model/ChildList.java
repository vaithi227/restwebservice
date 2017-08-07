package com.vaithi.restws.model;

import java.util.List;

public class ChildList {
	
	private List<String> childID;
	
		public ChildList() {
		super();
	}

		public ChildList(List<String> childID) {
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
			return "ChildList [childID=" + childID + "]";
		}

	

}
