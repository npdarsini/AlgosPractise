package com.company.leetcode;

import java.io.IOException;
import java.util.*;

public class DirectionsTest {

    //    private static final Scanner scanner = new Scanner(Scanner.class);
    private static final DestinationCalculator calculator = new DestinationCalculator();

    public static void main(String args[]) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        while (scanner.hasNextLine()) {
//            bufferedWriter.write(calculator.Process(scanner.nextLine()));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//        scanner.close();

        String line1 = calculator.Process("LOC:CHI:41.836944:-87.684722");
        String line2 = calculator.Process("LOC:NYC:40.7127:-74.0059");
        String line3 = calculator.Process("TRIP:C0FFEE1C:CHI:NYC");

        System.out.println(line1 + " \n" + line2 + " \n" + line3);
    }

}

class DestinationCalculator {

    private static final int RadiusMiles = 3963;
    Map<String, List<Double>> map = new HashMap<>();

    public String Process(String line) {

        String[] splitLine = line.split(":");
        String result = splitLine[1];

        if (splitLine[0].equalsIgnoreCase("LOC")) {
            Double latRadiance = convertToRadiance(Double.parseDouble(splitLine[2]));
            Double longRadiance = convertToRadiance(Double.parseDouble(splitLine[3]));
            map.put(splitLine[1], new ArrayList<>(Arrays.asList(latRadiance, longRadiance)));
        } else {
            Double longDiff = Math.abs(map.get(splitLine[2]).get(1) - map.get(splitLine[3]).get(1));

            Double angle = Math.acos(
                    (Math.sin(map.get(splitLine[2]).get(0)) * Math.sin(map.get(splitLine[3]).get(0))) +
                            (Math.cos(map.get(splitLine[2]).get(0)) * Math.cos(map.get(splitLine[3]).get(0)) * Math.cos(longDiff))
            );

            int distance = (int) Math.floor(RadiusMiles * angle);

            result += ":" + splitLine[2] + ":" + splitLine[3] + ":" + String.valueOf(distance);
        }


        return result;

    }

    private Double convertToRadiance(double degreeVal) {
        return degreeVal * Math.PI / 180;
    }


}


