package com.company;

public class FlipAndInvert {

    public static void main(String args[]) {

        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        int[][] result = new int[A.length][];

        for (int i = 0; i < A.length; i++) {
            int[] inn = new int[A[i].length];
            for (int k = 0, j = A[i].length - 1; j > -1; j--) {

                inn[i] = A[i][j] ==1 ? 0 : 1;

//                if (A[i][j] == 0) {
//                    inn[k++] = 1;
//                } else {
//                    inn[k++] = 0;
//                }
            }
            result[i] = inn;
        }


    }

}
