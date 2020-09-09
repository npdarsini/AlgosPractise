package com.company.leetcode;

import java.util.*;

public class SlowestKeyPress {

    public static void main(String args[]) {

        int[][] keys = {{0,2},
                {1,5},
                {0,9},
                {2,15},
                {3,27}
        };

        char res = helper(keys);
        System.out.println(res);
    }

    private static char helper(int[][] keys) {

        Map<Integer, ArrayList<Integer>> keysMap = new HashMap<>();
        if(keys.length == 1) {
            return (char) (keys[0][0] +97);
        }

        int time = keys[0][1];
        int res = keys[0][0];
        int mapRes = 0;
        double mapTime = 0;

        for(int i =1; i<keys.length; i++) {
//            if(keys[i][1] - keys[i-1][1] > time) {
//                time = keys[i][1] - keys[i-1][1];
//                res = keys[i][0];
//            }
            if(keysMap.containsKey(keys[i][0])) {
                ArrayList<Integer> inList = keysMap.get(keys[i][0]);
                inList.add(keys[i][1]);
                keysMap.put(keys[i][0], inList);
            } else {
                keysMap.put(keys[i][0], new ArrayList<>(Arrays.asList(keys[i][1])));
            }
        }

        for(Map.Entry entry : keysMap.entrySet()) {
            double x = getSum((ArrayList<Integer>) entry.getValue());
            if(mapTime < x) {
                mapTime = x;
                mapRes = (int) entry.getKey();
            }
        }

        return (char) (mapRes+97);
    }

    private static double getSum(ArrayList<Integer> list) {
        int n = list.size();
        int sum = 0;

        for(int i : list) {
            sum = sum+i;
        }

        return sum/n;
    }


}
