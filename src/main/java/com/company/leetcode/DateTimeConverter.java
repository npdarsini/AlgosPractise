package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DateTimeConverter {

    public static void main(String args[]) {

//        String input = "2018-03-06T18:00:56";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
//        LocalDate date = LocalDate.parse(input, formatter);
//
//        System.out.println(date);

        // System.out.println("start = " + start + "  end = " + end);
//
//        System.out.println("diff hours = " + diff.toHours());
////        System.out.println("diff days = " + Duration.between(start, end).toDays());
////        System.out.println("diff days starthrs = " + Duration.between(starthrs, end).toDays());
//
//        System.out.println("diff days = " + Duration.between(start, end).toHours());
//        System.out.println("diff days = " + Duration.between(start, end).toHours()/24);
//        System.out.println("diff days = " + Duration.between(start, end).toHours()%24);

//        Instant start = Instant.parse("2019-06-18T23:16:41.325Z");
//        Instant starthrs = Instant.now().minus(Duration.ofHours(2));
//        Instant end = Instant.now();
//        Duration diff = Duration.between(start, end);
//
//        long diffHours = diff.toHours();
//        System.out.println("diff hours = " + diff.toHours());
//
//        LocalDateTime startDateTime = start.atZone(ZoneOffset.UTC).toLocalDateTime();
//        LocalDateTime endDateTime = end.atZone(ZoneOffset.UTC).toLocalDateTime();
//
//        System.out.println("start hours = " + startDateTime.getHour());
//        System.out.println("end hours = " + endDateTime.getHour());
//        System.out.println("start day = " + startDateTime.getDayOfMonth());
//        System.out.println("end day = " + endDateTime.getDayOfMonth());
//
//        int startDate = startDateTime.getDayOfMonth();
//        int endDate = endDateTime.getDayOfMonth();
//        String queryStartDate = "";
//        String queryEndDate = "";
//
//        if ((startDate == endDate && startDateTime.getHour() > 8 && endDateTime.getHour() < 9) || (startDate != endDate && startDateTime.getHour() < 8)) {
//            // just check for time
//            queryStartDate = new SimpleDateFormat("yyyyMMdd").format(start);
//            queryEndDate = new SimpleDateFormat("yyyyMMdd").format(end);
//
//        } else if (startDate != endDate && startDateTime.getHour() > 8) {
//            queryStartDate = new SimpleDateFormat("yyyyMMdd").format(start.plus(1, ChronoUnit.DAYS));
//            queryEndDate = new SimpleDateFormat("yyyyMMdd").format(end);
//
//        }

        List<String> pass = new ArrayList();
        List<String> fail = new ArrayList();

        for (int startDateTimeHour = 0; startDateTimeHour < 24; startDateTimeHour++) {
            for (int endDateTimeHour = startDateTimeHour ; endDateTimeHour < 24; endDateTimeHour++) {
                if (startDateTimeHour > 8 || endDateTimeHour < 8) {
                    pass.add(startDateTimeHour + " - " + endDateTimeHour);
                } else {
                    fail.add(startDateTimeHour + " - " + endDateTimeHour);
                }
            }
        }

        System.out.println(pass);
        System.out.println(fail);

    }
}
