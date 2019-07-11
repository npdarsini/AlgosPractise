package com.company.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PubDateValidation {

    private static String validDateMessage = "Title requires valid";
    private static String futureDateMessage = "Title has future";
    private static String noPrintPubDateMessage = "Title requires valid print publication date when Digital Only is enabled";
    private static String noEpublicationDateMessage = "Title requires ebook print publication date";
    private static String category = "Publication Date";
    private static StatusCodes status = StatusCodes.CRITICAL;


    public static List<ValidationError> validate(DocumentData documentData) {
        List<ValidationError> resultList = new ArrayList<>();
        if (null == documentData) {
            return Arrays.asList(new ValidationError("Document Data", "No Document Data found", StatusCodes.CRITICAL));
        }
        BiblioMetaData biblioMetaData = documentData.getBiblioMetaData();
        if (null == biblioMetaData) {
            return Arrays.asList(new ValidationError("BiblioMetaData", "No BiblioMetaData found", StatusCodes.CRITICAL));
        }

        if (biblioMetaData.geteBookPublicationDate() != null) {
            resultList.add(PublicationDateValidation(biblioMetaData.geteBookPublicationDate(), " ebook publication date"));
        } else {
            resultList.add(new ValidationError(category, noEpublicationDateMessage, status));
        }

        if (biblioMetaData.getDigitalOnly() == "true" && biblioMetaData.getPrintPublicationDate() != null) {
            resultList.add(PublicationDateValidation(biblioMetaData.getPrintPublicationDate(), " print publication date"));
        } else if (biblioMetaData.getDigitalOnly() == "true" && biblioMetaData.getPrintPublicationDate() == null) {
            resultList.add(new ValidationError(category, noPrintPubDateMessage, status));
        }

        return resultList;
    }

    private static ValidationError PublicationDateValidation(String s, String type) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(dateBuilder(s));
            if (date.after(new Date())) {
                return new ValidationError(category, futureDateMessage + type, StatusCodes.WARNING);
            }
        } catch (ParseException e) {
            return new ValidationError(category, validDateMessage + type, status);
        }
        return new ValidationError();
    }

    private static String dateBuilder(String s) {
        return s.substring(0, 4) + "/" + s.substring(4, 6) + "/" + s.substring(6);
    }

    public static void main(String args[]) {

        DocumentData documentData = new DocumentData();
        BiblioMetaData biblioMetaData = new BiblioMetaData();
        ValidationError validationError = new ValidationError();

        biblioMetaData.setDigitalOnly("true");
        biblioMetaData.seteBookPublicationDate("20171234");
        biblioMetaData.setPrintPublicationDate(null);

        documentData.setBiblioMetaData(biblioMetaData);

        List<ValidationError> results = validate(documentData);
        for (ValidationError result : results) {
            System.out.println(validationError.getValue(result));
        }

    }
}
