package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConsecutiveProduct {

    public static void main(String args[]) {

        int start = 6;
        int end = 20;

        int res = getCons(6, 20);
    }


    public static int getCons(int s, int e) {

return -1;
    }

//    def solution(A):
//    validWords = [word for word in A if len(word) == len(set(word))]
//    result_str = ""
//    def helper(curr_index):
//    maxVal = 0
//    nonlocal result_str
//        for i in range(curr_index, len(validWords)):
//            if len(set(result_str+validWords[i])) == len(result_str) + len(validWords[i]):
//    result_str += validWords[i]
//    maxVal = max(maxVal, len(validWords[i]) + helper(i+1))
//    result_str = result_str[:-len(validWords[i])]
//            return maxVal
//
//    return helper(0)

    public int solution(String[] A) {
        // write your code in Java SE 8
        List<String> validWords = new ArrayList();
        for (String str : A) {
            char[] ch = str.toCharArray();
            Set<Character> set = new HashSet();
            boolean isDuplicate = false;
            for (char c : ch) {
                if (!set.add(c)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                validWords.add(str);
            }

        }

        return helper(0, validWords, new HashSet<>());
    }

    public int helper(int index, List<String> validWords, Set<Character> charSet) {
        int max_val = 0;

        for (int i = index; i < validWords.size(); i++) {
            Set<Character> localSet = new HashSet<>();
            boolean isDuplicate = false;
            String curWord = validWords.get(i);
            for (char c : curWord.toCharArray()) {
                if (charSet.contains(c)) {
                    isDuplicate = true;
                    break;
                } else {
                    localSet.add(c);
                }
            }
            if (!isDuplicate) {
                charSet.addAll(localSet);
                max_val = Math.max(max_val, curWord.length() + helper(i + 1, validWords, charSet));
            }

            for (char c : localSet) {
                charSet.remove(c);
            }
        }

        return max_val;
    }
}
