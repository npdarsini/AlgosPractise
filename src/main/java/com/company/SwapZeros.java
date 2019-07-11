package com.company;

public class SwapZeros {

    public static void main(String args[]) {

        int[] nums = {0,0, 4,2, 4, 0, 0, 3, 0, 5, 1, 0};
        int n = nums.length;

        for (int i = 0 , j = 1; j < nums.length; j++)
        {
            if (nums[i] == 0 && nums[j] == 0)
                continue;
            if (nums[i] == 0 && nums[j] != 0)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            i++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }


    public static int[] swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }

        return nums;

    }
}
