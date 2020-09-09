package com.company.leetcodeContest;

public class ReplaceString {

    public static void main(String [] args) {
        String res = modifyString("?zs");
        System.out.println(res);
    }
    public static String modifyString(String s) {

        if(s == null || s.isEmpty()) {
            return s;
        }

        for(int i =0; i < s.length(); i++) {

            if(s.charAt(i) == '?') {
                int first = i-1;
                while(i < s.length() && s.charAt(i) == '?') {
                    i++;
                }
                s = getString(s,first, i);
            }
        }

        return s;

    }

    public static String getString(String s, int first, int last) {

        char c1 = 'a';
        if(first == -1 && s.length() > 1) {
            if(s.charAt(first+1) == '?') {
                c1 = 'a';
            } else {
                c1 = s.charAt(first+1);
                --c1;
            }
        } else if(first > -1) {
            c1 = s.charAt(first);
        }

        char c2 = s.charAt(last);


        String res = "";
        for(int i = first; i < last-1; i++) {
            c1++;
            res = res+c1;

//            System.out.println(c1);
            if(c1 > 'z') {
                c1 = 'a';
            }
        }

        if(c1 == last && first != last) {
            c1++;
        }
        res = res+c1;

        System.out.println(res);

        if(first > 0) {
            res = s.substring(0, first)+ res;
        }
        return res + res.substring(last);
    }
}