package com.company.leetcode;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.TimeZone;

import static java.time.format.DateTimeFormatter.BASIC_ISO_DATE;

/**
 * @author PNidadav
 * @project Practise
 */
public class CurDate {

    public static void main(String args[]) {

       // System.out.println(ZoneId.getAvailableZoneIds());
        LocalTime time  = LocalTime.now(ZoneId.of("UTC"));
        System.out.println(time.getHour());


        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().format(BASIC_ISO_DATE));

        Instant end = Instant.now();
        LocalTime time1  = end.atZone(ZoneOffset.UTC).toLocalTime();
        System.out.println(time1.getHour());

        Date myDate = Date.from(end);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String formattedDate = formatter.format(myDate);
        System.out.println(formattedDate);
    }
}
