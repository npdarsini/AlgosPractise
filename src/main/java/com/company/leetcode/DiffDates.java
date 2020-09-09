package com.company.leetcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiffDates {

    public static void main(String args[]) {

        int res = daysBetweenDates("2019-06-29", "2019-06-30");
        System.out.println(res);
    }

    public static int daysBetweenDates(String date1, String date2) {

        String[] first = date1.split("-");
        String[] second = date2.split("-");
        LocalDate firstDate = LocalDate.of(Integer.parseInt(first[0]), Integer.parseInt(first[1]), Integer.parseInt(first[2]));
        LocalDate secondDate = LocalDate.of(Integer.parseInt(second[0]), Integer.parseInt(second[1]), Integer.parseInt(second[2]));

        int diffInDays = (int) ChronoUnit.DAYS.between(firstDate, secondDate);

        return diffInDays;


    }

}
