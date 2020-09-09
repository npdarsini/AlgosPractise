package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static void main(String args[]){


    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList();

        if(right == 0){
            return result;
        }

        boolean flag = true;
        for(int i = left; i<=right; i++){
            int actualNum = i;
            while(i >0){
                int rem = i%10;
                i = i/10;
                if(rem == 0 || actualNum % rem != 0){
                    flag = false;
                }
            }

//            int n = String.valueOf(i).length();
//
//            for(int k =0; k<n ; k++){
//                if(c!= '0' && i% Integer.parseInt(String.valueOf(c)) == 0){
//                    flag = true;
//                } else{
//                    flag = false;
//                    break;
//                }
//            }

            if(flag == true){

                result.add(i);
            }

        }

        return result;
    }
}
