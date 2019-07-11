package com.company;

public class QueueRecon {

    public static void main(String args[]) {

        int[][] input = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] output = reconstructQueue(input);


    }

    public static int[][] reconstructQueue(int[][] people) {
        int[][] sortArray = getSortedArray(people);

        return sortArray;
    }

    private static int[][] getSortedArray(int[][] people) {
        int[][] sortResult = new int[people.length][2];

        for (int i = 0; i < people.length; i++) {
            if (people[i][1] > people[i + 1][1]) {

            }
        }
        return sortResult;
    }

}
