package com.company;

public class ParitySort {

    public static void main(String args[]) {

        int[] A = {2, 1, 2, 5, 3, 2};

        int[] result = new int[A.length];

//        int low = 0;
//        int high = A.length - 1;
//
//        for (int i = 0; i< A.length; i++) {
//
//            //System.out.println(" : "+ A[i]);
//
//            if (A[i] % 2 == 0) {
//                result[low] = A[i];
//                System.out.println(" result[low] "+ result[low] + ":" + low);
//                low++;
//            } else {
//                result[high] = A[i];
//                System.out.println(" result[high] "+ result[high] + ":" + high);
//                high--;
//            }
//        }
//        for (int i = 0; i< result.length; i++) {
//            System.out.println(result[i]);
//        }

        for (int i = 0, j = 0; j < A.length; j++)
            if (A[j] % 2 == 0) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
                System.out.println(":" + A[j]);
            }


        for (int i = 0; i< A.length; i++) {
            System.out.println(A[i]);
        }

    }

}
