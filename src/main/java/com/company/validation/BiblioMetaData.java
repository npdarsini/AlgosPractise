package com.company.validation;

public class BiblioMetaData {

    private int documentId;
    private String printPublicationDate;
    private String eBookPublicationDate;
    private String digitalOnly;

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getPrintPublicationDate() {
        return printPublicationDate;
    }

    public void setPrintPublicationDate(String printPublicationDate) {
        this.printPublicationDate = printPublicationDate;
    }

    public String geteBookPublicationDate() {
        return eBookPublicationDate;
    }

    public void seteBookPublicationDate(String eBookPublicationDate) {
        this.eBookPublicationDate = eBookPublicationDate;
    }

    public String getDigitalOnly() {
        return digitalOnly;
    }

    public void setDigitalOnly(String digitalOnly) {
        this.digitalOnly = digitalOnly;
    }
}
