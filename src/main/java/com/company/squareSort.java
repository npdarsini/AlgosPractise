package com.company;

import java.util.Arrays;

public class squareSort {

    public static void main(String args[]) {

        int[] A = {-4, -1, 0, 3, 10};
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
            System.out.print(A[i] + " ");

        }
        System.out.println();
       // Arrays.sort(A);

        for(int i = 0; i< A.length; i++){
            for (int j = i+1; j < A.length; j++){
                if(A[i] > A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }


        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
