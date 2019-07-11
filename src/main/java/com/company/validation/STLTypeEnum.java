package com.company.validation;

public enum STLTypeEnum {
	STL ("STL"),
	DIFF_STL ("DiffSTL");

	private final String type;
	STLTypeEnum(String type) {
		this.type = type;
	}
	// TODO: confirm removal of ununsed getter
	// public String getType () {
	//	return type;
	//}
}
