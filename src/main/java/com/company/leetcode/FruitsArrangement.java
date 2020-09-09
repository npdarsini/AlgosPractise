package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FruitsArrangement {


    public static void main(String args[])
    {
        List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> inList = new ArrayList<String>();

            inList.add("apple");
            inList.add("apple");

            list.add(inList);

        ArrayList<String> inList2 = new ArrayList<String>();

        inList2.add("banana");
        inList2.add("anything");
        inList2.add("banana");

            list.add(inList2);




        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("orange");
        shoppingList.add("apple");
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("orange");
        //shoppingList.add("orange");
        shoppingList.add("banana");


        //real code

        int n = list.size();
        int count = 0;

        for(int i =0; i< n ; i++)
        {
            ArrayList<String> sample = list.get(i);
            //System.out.println(sample);

            for(int j =0; j<sample.size(); j++)
            {
                System.out.println(j);
                if( sample.get(j).equals(shoppingList.get(count)))
                {
                    count++;
                }

                else if(sample.get(j).equals("anything") )
                {
                    count++;
                    j= j-1;
                }


            }
        }

        if(count == shoppingList.size())
            System.out.println("1");
        else
            System.out.println("0");



    }
}
