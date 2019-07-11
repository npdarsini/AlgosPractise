package com.company.validation;

public enum StatusCodes {

    WARNING("WARNING"),
    CRITICAL("CRITICAL");
    private String value;

    StatusCodes(String value) {
        this.value = value;
    }

    // TODO: confirm removal of ununsed getter
 /*   public String getValue() {
        return value;
    }*/
   }
