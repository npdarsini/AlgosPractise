package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringOverride {
    public static void main(String args[]){
        List<String> str = new ArrayList<>(Arrays.asList("Nasir.Grewal@proquest.com",
                "Priyadarsini.Nidadavolu@proquest.com",
                "Randy.Belt@proquest.com",
                "Keith.Lukaszewski@proquest.com"));
        for(int i = 0; i < 10; i++){
            System.out.println(str);
            if(i %2 == 0){
                str.add("priyadarsini");
            }
        }
    }
}
