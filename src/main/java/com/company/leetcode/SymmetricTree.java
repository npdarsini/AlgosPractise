package com.company.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        List<Integer> leftTree = leftProcess(root.left);
        List<Integer> rightTree = rightProcess(root.right);

        if (leftTree.size() == rightTree.size()) {
            for (int i = 0; i < leftTree.size(); i++) {
                if (leftTree.get(i) != rightTree.get(i)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private List<Integer> leftProcess(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }

        ((LinkedList<TreeNode>) queue).add(root);
        TreeNode cur = root;

        while (!queue.isEmpty()) {
            TreeNode peekEle = ((LinkedList<TreeNode>) queue).pop();
            if (peekEle != null) {
                result.add(peekEle.val);
                queue.add(peekEle.right);
                queue.add(peekEle.left);
            } else {
                result.add(null);
            }
        }
        return result;
    }

    private List<Integer> rightProcess(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }

        ((LinkedList<TreeNode>) queue).add(root);
        TreeNode cur = root;

        while (!queue.isEmpty()) {
            TreeNode peekEle = ((LinkedList<TreeNode>) queue).pop();
            if (peekEle != null) {
                result.add(peekEle.val);
                queue.add(peekEle.left);
                queue.add(peekEle.right);

            } else {
                result.add(null);
            }
        }
        return result;
    }
}
