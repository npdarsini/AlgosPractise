package com.company.validation;

import java.math.BigDecimal;

public class ShortTermLendingPercent {
	private Integer shortTermLendingPercentID;

	private Integer productPreferenceID;
	
    private STLDaysEnum lengthDays;
	
    private BigDecimal stlPercent;
    
    private String type;

	public STLDaysEnum getLengthDays() {
		return lengthDays;
	}

	public void setLengthDays(STLDaysEnum lengthDays) {
		this.lengthDays = lengthDays;
	}

	public BigDecimal getStlPercent() {
		return stlPercent;
	}

	public void setStlPercent(BigDecimal stlPercent) {
		this.stlPercent = stlPercent;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
