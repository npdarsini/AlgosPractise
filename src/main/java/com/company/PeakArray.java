package com.company;

public class PeakArray {

    public int peakIndexInMountainArray(int[] A) {

        for(int i = A.length-1; i> 0; i--){
            if(A[i] > A[i-1]){
                return i;
            }
        }

        return 1;

    }
}
