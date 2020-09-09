package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ClosestDivisors {


    public int[] getMultiples(int num) {

        List<Integer> visitedList = new ArrayList();
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                if (visitedList.contains(i)) {
                    return new int[]{i, num / i};
                }
                visitedList.add(i);
                visitedList.add(num / i);

            }
        }

        return new int[]{1, num};
    }
}
