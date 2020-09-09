package com.company.leetcode;

/**
 * @author PNidadav
 * @project Practise
 */
public class PassByReference {

    public String a = "priya";

    public static void main(String args[]) {
        PassByReference passByReference = new PassByReference();
        System.out.println(passByReference.a);
        passByReference.a = "priya + 1";
        System.out.println(passByReference.a);
        passByReference.callMethod1(passByReference.a);
        System.out.println(passByReference.a);
    }

    private void callMethod1(String a) {
        PassByReference passByReference = new PassByReference();
        passByReference.a = "priya + 2";
        a = a +"priya +2";
    }
}
