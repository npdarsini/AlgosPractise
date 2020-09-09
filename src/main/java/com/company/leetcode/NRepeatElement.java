package com.company.leetcode;

import java.util.HashMap;

public class NRepeatElement {

    public static void main(String args[]) {

        int[] A = {2, 1, 2, 5, 3, 2};
        HashMap<Integer, Integer> map = new HashMap();

        for (int i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == A.length / 2) {
                System.out.println(key);
            }
        }


    }
}
