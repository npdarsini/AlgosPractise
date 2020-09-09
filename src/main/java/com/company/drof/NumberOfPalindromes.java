package com.company.drof;

public class NumberOfPalindromes {

    public static void main(String args[]) {

        String s = "tacocat";
        int count = getCount(s);
        System.out.println(count);
    }

    private static int getCount(String s) {
        int length = s.length();
        int count = 0;
        for (int mid = 0; mid <= 2 * length- 1; ++mid) {
            int left = mid / 2;
            int right = left + mid % 2;
            while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;

//        return items.get(0) [0] for item in items[pageNumber*itemsPerPage: (pageNumber+1)*itemsPerPage]]
    }
}
