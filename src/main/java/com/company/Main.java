package com.company;

public class Main {

    public static int Mul(int a, int b)
    {
       int min = Math.min(a,b);
       int max = Math.max(a,b);
       int result = max;

       int arr [] = new int [2];
       int z = arr.length;
       while(max> min)
       {
           System.out.println("max" +max);
           max--;
           result = result*max;
       }

       return result;
    }

    public static int binaryMul(int a, int b)
    {
        int left = Math.min(a,b);
        int right = Math.max(a,b);

        int mid = (left+right)/2;
        int result = 1;

        if(left == right)
            return left;

        if(left<right)
        {
            System.out.println("res before= "+result);
            result = result*binaryMul(left,mid)*binaryMul(mid+1,right);
            System.out.println("res= "+result);
        }


        return result;
    }

    public static void main(String[] args) {
	// write your code here

        int result = Mul(5,8);
        System.out.println(result);
        int result1 = binaryMul(5,8);
        System.out.println("result 1 = "+result1);
    }
}
