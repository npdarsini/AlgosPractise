package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author PNidadav
 * @project Practise
 */
public class nQueens {

    public static List<String> opList = new ArrayList(Arrays.asList("Q...", ".Q..", "..Q.", "...Q"));

    public static void main(String args[]) {

        nQueens nQueens = new nQueens();
        List<List<Integer>> result = nQueens.findLocation(4);
        System.out.println("Result = " + result);
        System.out.println("Result = " + opList.get(0));
        System.out.println("Result = " + opList.get(3));
    }

    public List<List<Integer>> findLocation(int n) {

        List<List<Integer>> result = new ArrayList<>();
        getLoc(result, new ArrayList(), 0, n);
        return result;
    }

    private void getLoc(List<List<Integer>> result, List colList, int row, int n) {

        if (row == n) {
            result.add(new ArrayList<>(colList));
        } else {
            for (int col = 0; col < n; col++) {
                colList.add(col);
                if (valid(colList)) {
                    getLoc(result, colList, row + 1, n);
                }
                colList.remove(colList.size() - 1);
            }
        }
    }

    private boolean valid(List<Integer> colList) {

        System.out.println("colList = " + colList);
        int rowid = colList.size() - 1;
        System.out.println("rowid = " + rowid);
        for (int i = 0; i < rowid; i++) {
            int diff = Math.abs(colList.get(rowid) - colList.get(i));
            System.out.println("diff = " + diff);
            if (diff == 0 || diff == rowid - i)
                return false;
        }
        return true;
    }
}
