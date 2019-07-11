package com.company;

/**
 * @author PNidadav
 * @project Practise
 */
public class NextPermutation {

    public static void main(String args[]) {
       int[] n = {6, 2, 1, 5, 4, 3, 0};
//        int[] n = {3,2,1};
//        int[] n = {1,2,3};

        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(n);
    }

    public void nextPermutation(int[] nums) {

        int k = nums.length - 1;
        int i = nums.length - 2;
        while (i > -1) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
            i--;
        }

        System.out.println(i);
        if (i > -1) {
            int index = i + 1;
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    index = j;
                    break;
                }
            }
            swap(nums, i, index);
        }

        for (int d = 0; d < nums.length; d++) {
            System.out.print(nums[d] + "\t");
        }

        System.out.println();

        while (i++ < k) {
            swap(nums, i, k);
            k--;
        }


        for (int d = 0; d < nums.length; d++) {
            System.out.print(nums[d] + "\t");
        }

    }

    public void swap(int[] nums, int i, int index) {
        int dummy = nums[i];
        nums[i] = nums[index];
        nums[index] = dummy;
    }

}
