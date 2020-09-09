package com.company.leetcode;

public class FindOulier {

    public static void main(String args[]) {

        int [] nums = new int[] {2,4,6,8,8,10,23};

        int result = find(nums);

        System.out.println(result);

    }

    private static int find(int[] nums) {

        boolean isEven = false;
        if(nums[0] % 2 ==0  && nums[1] %2 == 0) {
            isEven = true;
        } else if(nums[2] %2 == 0) {
            isEven = true;
        }

        if(isEven) {
            for(int i =0; i< nums.length; i++) {
                if(nums[i] % 2 != 0) {
                    return nums[i];
                }
            }
        } else {
            for(int i =0; i< nums.length; i++) {
                if(nums[i] % 2 == 0) {
                    return  nums[i];

                }
            }
        }

        return -1;
    }


}
