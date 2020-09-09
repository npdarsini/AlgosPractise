package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public List<Integer> inOrder(TreeNode root) {

        List<Integer> result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if (null == root) {
            return result;
        }

        TreeNode cur = root;
        while (!stack.empty() || cur != null) {

            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }

        return result;
    }
}
