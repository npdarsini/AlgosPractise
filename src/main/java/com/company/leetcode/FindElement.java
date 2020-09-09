package com.company.leetcode;

public class FindElement {

    public static void main(String args[]) {

        int [] nums = new int[] {2,4,5,6,8,8,9,10,23};
        int target = 1;

        boolean result = sortedArraySearch(target, nums);

        System.out.println(result);

    }

    public static boolean sortedArraySearch(int target, int[] nums){

        int low = 0;
        int high = nums.length-1;

        while(low < high) {
            int mid = low+(high-low)/2;

            if(nums[mid] == target) {
                return true;
            }

            if(nums[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }


        return false;
    }
}
