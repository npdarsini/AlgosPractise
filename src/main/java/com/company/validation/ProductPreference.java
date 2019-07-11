package com.company.validation;

import java.math.BigDecimal;

public class ProductPreference {

	private Integer productPreferenceID;

	private boolean isPerpetual;

	private boolean is1User;
	private BigDecimal oneUserPricePercent;

	private boolean is3User;
	private BigDecimal threeUserPricePercent;

	private boolean isUnlimitedUser;
	private BigDecimal unlimitedUserPricePercent;

	private boolean isNonLinear;
	private BigDecimal nonLinearPricePercent;

	private Integer maxLendingDays;
	public Integer getMaxLendingDays() {
		return maxLendingDays;
	}
	public void setMaxLendingDays(Integer maxLendingDays) {
		this.maxLendingDays = maxLendingDays;
	}

	private boolean isDDA;
	private boolean isSTL;

	public boolean isATO() {
		return isATO;
	}

	public void setATO(boolean ATO) {
		isATO = ATO;
	}

	private boolean isATO;





	public BigDecimal getOneUserPricePercent() {
		return oneUserPricePercent;
	}

	public void setOneUserPricePercent(BigDecimal oneUserPricePercent) {
		this.oneUserPricePercent = oneUserPricePercent;
	}



	public BigDecimal getThreeUserPricePercent() {
		return threeUserPricePercent;
	}

	public void setThreeUserPricePercent(BigDecimal threeUserPricePercent) {
		this.threeUserPricePercent = threeUserPricePercent;
	}

	public BigDecimal getUnlimitedUserPricePercent() {
		return unlimitedUserPricePercent;
	}

	public void setUnlimitedUserPricePercent(BigDecimal unlimitedUserPricePercent) {
		this.unlimitedUserPricePercent = unlimitedUserPricePercent;
	}

	public BigDecimal getNonLinearPricePercent() {
		return nonLinearPricePercent;
	}

	public void setNonLinearPricePercent(BigDecimal nonLinearPricePercent) {
		this.nonLinearPricePercent = nonLinearPricePercent;
	}

	public boolean isDDA() {
		return isDDA;
	}

	public void setDDA(boolean DDA) {
		isDDA = DDA;
	}

	public boolean isSTL() {
		return isSTL;
	}

	public void setSTL(boolean STL) {
		isSTL = STL;
	}

	public boolean isPerpetual() {
		return isPerpetual;
	}

	public void setPerpetual(boolean isPerpetual) {
		this.isPerpetual = isPerpetual;
	}

	public boolean is1User() {
		return is1User;
	}

	public void set1User(boolean is1User) {
		this.is1User = is1User;
	}

	public boolean is3User() {
		return is3User;
	}

	public void set3User(boolean is3User) {
		this.is3User = is3User;
	}

	public boolean isUnlimitedUser() {
		return isUnlimitedUser;
	}

	public void setUnlimitedUser(boolean isUnlimitedUser) {
		this.isUnlimitedUser = isUnlimitedUser;
	}

	public boolean isNonLinear() {
		return isNonLinear;
	}

	public void setNonLinear(boolean isNonLinear) {
		this.isNonLinear = isNonLinear;
	}

}
