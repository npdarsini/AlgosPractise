package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringReplace {

    public static void main(String[] args) {
        // write your code here

        List<String> nullfields =  new ArrayList<String>();
        nullfields.add("eBookISBN");
        nullfields.add("pdfISBN");
        nullfields.add("ePubISBN");
        nullfields.add("eBookISBN2");
        nullfields.add("eBookISBN3");
        nullfields.add("printISBN");
        nullfields.add("hardBackISBN");
        nullfields.add("softBackISBN");
        nullfields.add("printISBN2");
        nullfields.add("printISBN3");



        String queryString ="";

        for(String s: nullfields)
        {
            if(s.equalsIgnoreCase("eBookISBN") || s.equalsIgnoreCase("pdfISBN") || s.equalsIgnoreCase("ePubISBN") || s.equalsIgnoreCase("eBookISBN2") || s.equalsIgnoreCase("eBookISBN3") || s.equalsIgnoreCase("printISBN") || s.equalsIgnoreCase("hardBackISBN") || s.equalsIgnoreCase("softBackISBN") || s.equalsIgnoreCase("printISBN2") || s.equalsIgnoreCase("printISBN3") )
            {
                if(s.contains("eBookISBN")) {
                    if(s.equals("eBookISBN"))
                        s = s.replace("eBookISBN", "eBookISBN13");

                    else
                        s = s.replace("eBookISBN", "eBookISBN13_");
                    System.out.println("String is: "+s);
                }

                if(s.contains("pdfISBN")) {
                    if(s.equals("pdfISBN"))
                        s = s.replace("pdfISBN", "pdfISBN13");

                    else
                        s = s.replace("pdfISBN", "pdfISBN13_");
                    System.out.println("String is: "+s);
                }

                if(s.contains("ePubISBN")) {
                    if(s.equals("ePubISBN"))
                        s = s.replace("ePubISBN", "ePubISBN13");

                    else
                        s = s.replace("ePubISBN", "ePubISBN13_");
                    System.out.println("String is: "+s);
                }

                if(s.contains("printISBN")) {
                    if(s.equals("printISBN"))
                        s = s.replace("printISBN", "printISBN13");

                    else
                        s = s.replace("printISBN", "printISBN13_");
                    System.out.println("String is: "+s);
                }

                if(s.contains("softBackISBN") || s.contains("hardBackISBN")) {
                      s = s.replace(s, s+"13");

                }

                queryString = queryString+ s+ " = null, ";
            }
        }

        System.out.println("Query String is: "+queryString);


     }
}
