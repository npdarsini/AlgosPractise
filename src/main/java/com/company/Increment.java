package com.company;

import javafx.util.Pair;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author PNidadav
 * @project Practise
 */
public class Increment {

    public static void main(String args[]) {

        int a = 10;
        int b = 13;
        int x = 5;
        int y = 27;
        MaketheNumbersMatch(a, b, x, y);
        int count = 123;
        //Tuple(count);
    }

    private static void MaketheNumbersMatch(int a, int b, int x, int y) {

        //our goal is to match a,b values with x,y values respectively.
        //So as per this logic, this while loop will iterate until both conditions are met
        //So, at the max it runs for Max(|a-x| ,|b-y|) times.
        //Therefore the worst case time Complexity is O(Max(|a-x|, |b-y|)

        while (a != x || b != y) {

            // if a < x, we need to reach the value of x, so incrementing it. Else we decrement.

            if (a < x) {
                a++;
            } else if(a > x){
                a--;
            }

            // if b < y, we need to reach the value of y, so incrementing it. Else we decrement.
            if (b < y) {
                b++;
            } else if(b > y){
                b--;
            }

            System.out.println("a = " + a + " b = " + b);
        }
    }

    public static Pair tuple(int num) {

        int zeroCount = 0, oneCount = 0;
        int tempNum = num;
        if (num > 0)
            zeroCount++;
        else
        {
            oneCount++;
        }
        while (tempNum != 0) {
            //if num/2 gives a reminder 1, this means the number will have 1 bit in it
            if (tempNum % 2 == 1) {
                oneCount++;
            } else {
                zeroCount++;
            }
            tempNum = tempNum / 2;
        }

//        System.out.println(Integer.toBinaryString(num));

       Pair p = new Pair(zeroCount, oneCount);

        return p;

        //return new Tuple(zeroCount, oneCount);
    }

    public static class Tuple<ZeroCount, OneCount> {
        public ZeroCount zeroCount;
        public OneCount oneCount;

        public Tuple(ZeroCount zeroCount, OneCount oneCount) {
            this.zeroCount = zeroCount;
            this.oneCount = oneCount;
        }
    }

}
