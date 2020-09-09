package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String args[]) {
        int nums [] = {2,3,3,2,2,2,2,2,4,4,4,4,2,2,2,2};
        int result = getMajorityElement(nums);
        System.out.println(result);
    }

    private static int getMajorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap();

        for(int i =0; i < nums.length; i++)
        {
            if(counter.containsKey(nums[i])){
                counter.put(nums[i], counter.get(nums[i])+1);
            } else {
                counter.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> i : counter.entrySet()){

            if(i.getValue() > nums.length/2){
                return i.getKey();
            }

        }

        return 0;
    }

}
