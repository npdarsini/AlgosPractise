package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringCompare {

    public static void main(String args[]) {
        String[] words = new String[]{"mass", "as", "hero", "superhero"};
        List<String> result = stringMatching(words);
        System.out.println(result);
    }

    public static List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet();



        for (String str : words) {
                        for (String str2 : words) {
                System.out.println(str + " " + str2 + " "+ str.contains(str2));
                if (!str.equals(str2) && str.contains(str2)) {
                    res.add(str2);
                }
            }
        }

        return new ArrayList<String>(res);

    }
}
