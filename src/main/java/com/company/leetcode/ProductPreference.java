package com.company.leetcode;

import java.math.BigDecimal;

public class ProductPreference {

    private Integer productPreferenceID;
    private BigDecimal oneUserPricePercent;
    private BigDecimal threeUserPricePercent;

    public Integer getProductPreferenceID() {
        return productPreferenceID;
    }

    public void setProductPreferenceID(Integer productPreferenceID) {
        this.productPreferenceID = productPreferenceID;
    }

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
}
