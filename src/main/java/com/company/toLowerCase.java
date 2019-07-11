package com.company;

public class toLowerCase {

    public static void main(String args[]) {

        String str = "Hello";
        String result = "";

        for (char ch : str.toCharArray()) {

            if( (int) ch > 64 && (int) ch < 91 )
            ch = (char) ((int) ch + 32);
            result = result+ ch;
        }

        System.out.println(result);
    }
}
