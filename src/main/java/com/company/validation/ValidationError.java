package com.company.validation;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ValidationError {

    private String category;
    private String errorMessage;
    private StatusCodes statusCodes;

    public String getMessage() {
        return errorMessage;
    }

    public void setMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public StatusCodes getStatus() {
        return statusCodes;
    }

    public void setStatus(StatusCodes statusCodes) {
        this.statusCodes = statusCodes;
    }

    public ValidationError() {
    }

    public ValidationError(String category, String errorMessage, StatusCodes statusCodes) {
        this.category = category;
        this.errorMessage = errorMessage;
        this.statusCodes = statusCodes;
    }

    public String getValue(ValidationError validationError){
        return "Category = "+validationError.category+" error message = "+validationError.errorMessage+" status code = "+validationError.statusCodes;
    }
}
