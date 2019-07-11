package com.company;

//import org.apache.commons.lang3.StringUtils;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class LccTest {

    public static void main(String args[]) {
        getLccCategory("T-TXTJ210.2-211.495T");

    }

    public static void getLccCategory(String lcc) {
        if (null != lcc) {
            try {
                String[] tokens = lcc.split("-");
                for (int i = tokens.length - 1; i >= 0; i--) {
                    String token = tokens[i].trim();

                    if (token.startsWith(".")) {
                        token = token.substring(1);
                    }

                    int indexOfSpace = token.indexOf(" ");
                    if (indexOfSpace > 0) {
                        token = token.substring(0, indexOfSpace);
                    }
                    int indexOfDot = token.indexOf(".");
                    if (indexOfDot >= 0) {
                        if (Character.isDigit(token.charAt(indexOfDot + 1))) {
                            token = token.substring(0, indexOfDot + 2);
                        } else {
                            token = token.substring(0, indexOfDot);
                        }
                    }
                    String subClass = token.replaceAll("[^A-Z]", "");
                    String startRangeVal = token.replaceAll("[^0-9.]", "");

                    if (!subClass.isEmpty()) {
                        continue;
                    } else {
                        if (!startRangeVal.isEmpty()) {
                            startRangeVal = "1";
                        }
                        Double startRange = Double.valueOf(startRangeVal);
                        List<Double> startRanges = new ArrayList<Double>();

                        String lccCategory = "abc";

                        if (!lccCategory.isEmpty()) {
                            System.out.println("DOne");
                        }
                    }
                }
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    }
}
