package com.company;

import java.util.Stack;

/**
 * @author PNidadav
 * @project Practise
 */
public class removeOuterParanthesis {

    public static void main(String args[]){

        String s = removeOuterParentheses("(()(()))");
        System.out.println(s);

    }

    public static String removeOuterParentheses(String S) {
        String res = "";

        if( null == S){
            return res;
        }

        Stack<Character> stack = new Stack();
        int i =0;
        while(i < S.length()){
            if(stack.isEmpty()){
                stack.push(S.charAt(i));
            } else if(S.charAt(i)== stack.peek() ){
                stack.push(S.charAt(i));
            } else {

                if(stack.size() == 2) {
                    char c = stack.pop();
                    res = res + c+ S.charAt(i);
                } else if(stack.size() > 2){
                    int k =0;
                    String s = "";
                    while(stack.size() == 1){
                        k++;
                        s = stack.pop() + s;
                        System.out.println(s);
                    }

                    res = res + s+ S.substring(i, i+k);
                    i = i+k;
                }
            }

            i++;
        }

        return res;

    }
}
