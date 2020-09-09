package com.company.leetcode;

import java.io.IOException;
import java.util.*;

class Result {

    /*
     * Complete the 'teamFormation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY score
     *  2. INTEGER team_size
     *  3. INTEGER k
     */

    public static long teamFormation(List<Integer> score, int team_size, int k) {
        // Write your code here

        List<Integer> result = new ArrayList<Integer>();


        while(team_size > 0) {
            if(score.size() < k) {
                result.addAll(score);
                break;
            }
            int [] val = helper(score, k);
            result.add(val[0]);
            score.remove(val[1]);
            team_size--;
        }

        System.out.println(result);

        long sum = 0;

        for(Integer i : result) {
            sum+= i;
        }

        return sum;
    }


    public static int[] helper(List<Integer> score, int k) {
        System.out.println("new A: " + score);


        int leftIndex = 0;
        int leftMax = Integer.MIN_VALUE;

        for(int i =0; i<k ; i++) {
            if(leftMax < score.get(i)) {
                leftIndex = i;
                leftMax = score.get(i);
            }
        }


        int rightIndex = score.size()-1;
        int rightMax = score.get(rightIndex);

        if(score.size()-k  < 0) {
            return new int[] {leftMax, leftIndex};
        }

        for(int i =score.size()-1; i>score.size()-k ; i--) {
            if(rightMax <= score.get(i)) {
                rightIndex = i;
                rightMax = score.get(i);
            }
        }

        System.out.println(leftMax + " " + rightMax);

        if(leftMax < rightMax) {
            return new int[] {rightMax, rightIndex};
        } else if( leftMax ==  rightMax && leftIndex < rightIndex) {
            return new int[] {leftMax, leftIndex};
        } else if( leftMax ==  rightMax && leftIndex > rightIndex) {
            return new int[] {rightMax, rightIndex};
        } else {
            return new int[] {leftMax, leftIndex};
        }

    }

}

public class TeamSize {
    public static void main(String[] args) throws IOException {
        int scoreCount = 8;

        List<Integer> score = new ArrayList(Arrays.asList(new int[]{
                18, 5, 15, 18, 11, 15, 9, 7, 5, 1}));

        int team_size = 5;

        int k = 1;

        long result = Result.teamFormation(score, team_size, k);
        System.out.println(result);
    }

}
