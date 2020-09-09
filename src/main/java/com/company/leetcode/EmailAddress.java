package com.company.leetcode;

import java.util.HashSet;

public class EmailAddress {


    public static void main(String args[]) {

        String str[] = new String[]{"testemail@leetcode.com",
                "testemail1@leetcode.com",
                "testemail+david@lee.tcode.com"};

        int res = numUniqueEmails(str);

        System.out.println(res);
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> result = new HashSet();

        for (String email : emails) {
            result.add(refineEmail(email));
        }

        return result.size();
    }

    public static String refineEmail(String email) {

        System.out.println(email.substring(0, -1));

        if (email.indexOf("+") > -1) {
            String str = email.substring(0, email.indexOf("+")).replaceAll("\\.", "") + email.substring(email.indexOf("@"));
            System.out.println("str" + str);
            return str;
        } else {

            System.out.println(email.substring(0, email.indexOf("@")));
            System.out.println(email.substring(email.indexOf("@")));

            String str = email.substring(0, email.indexOf("@")).replaceAll("\\.", "") + email.substring(email.indexOf("@"));
            System.out.println("str1" + str);
            return str;
        }
    }
}

