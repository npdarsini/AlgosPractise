package com.company.validation;

public class DocumentData {

    private String eBookISBN10;
    private ProductPreference productPreference;
    private ShortTermLendingPercent shortTermLendingPercent;
    private BiblioMetaData biblioMetaData;

    public ProductPreference getProductPreference() {
        return productPreference;
    }

    public void setProductPreference(ProductPreference productPreference) {
        this.productPreference = productPreference;
    }

    public ShortTermLendingPercent getShortTermLendingPercent() {
        return shortTermLendingPercent;
    }

    public void setShortTermLendingPercent(ShortTermLendingPercent shortTermLendingPercent) {
        this.shortTermLendingPercent = shortTermLendingPercent;
    }

    public String geteBookISBN10() {
        return eBookISBN10;
    }

    public void seteBookISBN10(String eBookISBN10) {
        this.eBookISBN10 = eBookISBN10;
    }

    public BiblioMetaData getBiblioMetaData() {
        return biblioMetaData;
    }

    public void setBiblioMetaData(BiblioMetaData biblioMetaData) {
        this.biblioMetaData = biblioMetaData;
    }
}
