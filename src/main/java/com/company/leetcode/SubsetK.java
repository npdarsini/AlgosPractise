package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PNidadav
 * @project Practise
 */
public class SubsetK {

    public static void main(String args[]) {
        SubsetK s = new SubsetK();
        List<List<Integer>> result = s.subsets(5, 3);
        System.out.println(result);
    }

    public List<List<Integer>> subsets(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        getSubset(n, k, 1, new ArrayList(), result);
        return result;
    }

    public void getSubset(int n, int k, int offset, List<Integer> selectedSoFar, List<List<Integer>> result) {
        if (selectedSoFar.size() == k) {
            result.add(new ArrayList(selectedSoFar));
            return;
        }
        final int remaining = k - selectedSoFar.size();
        for (int i = offset; i <= n && remaining <= n - i + 1; ++i) {
            selectedSoFar.add(i);
            getSubset(n, k, i + 1, selectedSoFar, result);
            selectedSoFar.remove(selectedSoFar.size() - 1);
        }
    }
}
