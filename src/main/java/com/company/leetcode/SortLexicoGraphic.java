package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLexicoGraphic {

    public static void main(String args[]) {

        List<String> orderList = new ArrayList<>();

//        orderList.add("mi2 jog mid pet");
//        orderList.add("wz3 34 54 398");
//        orderList.add("al alps cow bar");
//        orderList.add("x4 45 21 7");

        orderList.add("zid 93 12");
        orderList.add("fp kindle book");
        orderList.add("10a echo show");
        orderList.add("17g 12 25 6");
        orderList.add("ab1 kindle book");
        orderList.add("125 echo dot second generation");

        List<String> result = prioritizedOrders(orderList.size(), orderList);

        System.out.println(result);
    }

    public static List<String> prioritizedOrders(int numOrders, List<String> orderList) {

        List<String> result = new ArrayList<>();

        if (numOrders == 0) {
            return result;
        }

        if (numOrders == 1) {
            return orderList;
        }

        List<String> primeList = new ArrayList<>();
        List<String> otherList = new ArrayList<>();

        for (int i = 0; i < numOrders; i++) {
            String order = orderList.get(i);
            int spaceIndex = order.indexOf(' ');
            System.out.println("Passed string  = " + order.substring(spaceIndex + 1, spaceIndex + 2));
            if (isNonPrime(order.substring(spaceIndex + 1, spaceIndex + 2))) {
                otherList.add(order);
            } else {
                primeList.add(order);
            }
        }

        primeList = getSorted(primeList);


        System.out.println("Prime List " + primeList);
        result.addAll(primeList);

        otherList = getSorted(otherList);
        System.out.println("order List " + otherList);
        result.addAll(otherList);

        return result;

    }

    private static List<String> getSorted(List<String> primeList) {

        for (int i = 0; i < primeList.size() - 1; i++) {
            for (int j = i + 1; j < primeList.size(); j++) {
                String iString = primeList.get(i);
                String jString = primeList.get(j);
                if (compare(iString.substring(iString.indexOf(' ' + 1)), jString.substring(jString.indexOf(' ' + 1))) > 0) {
                    String temp = primeList.get(i);
                    primeList.add(i, primeList.get(j));
                    primeList.add(j, temp);
                } else if (compare(iString.substring(iString.indexOf(' ' + 1)), jString.substring(jString.indexOf(' ' + 1))) == 0) {
                    String temp = primeList.get(i);
                    primeList.add(i, primeList.get(j));
                    primeList.add(j, temp);
                }
            }
        }

        return primeList;
    }


    private static boolean isNonPrime(String substring) {
        for (int i = 0; i < substring.length(); i++) {
            if (Character.isDigit(substring.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public static int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}
