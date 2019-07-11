package com.company;

public class QuickSort {

    public static void main(String args[]) {
        int[] A = new int[50001];
        for (int i = 0; i < 25000; i++) {
            A[i] = 1;
        }

        for (int i = 25000; i < 50001; i++) {
            A[i] = 2;
        }
//
//        for (int i = 0; i < A.length; i++) {
//            System.out.println(A[i]);
//        }


        QuickSort q = new QuickSort();
        q.quickSort(A, 0, A.length - 1);

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    static void quickSort(int[] a, int low, int high) {

            if (low < high) {
            int i = partition(a, low, high);
            quickSort(a, low, i - 1);
            quickSort(a, i + 1, high);
        }
    }

    static int partition(int[] x, int low, int high) {
        int pivot = x[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (x[j] <= pivot) {
                i++;
                x = swap(x, i, j);
            }
        }

        x = swap(x, i + 1, high);
        return i + 1;
    }

    private static int[] swap(int[] x, int i, int j) {
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;

        return x;
    }
}
