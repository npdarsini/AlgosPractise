package com.company;

import java.util.*;

public class NArrayPreOrderTraversal {

    public static void main(String args[]) {
        int[] nums = {4, 1, 2, 1, 2};
        List<Integer> result = singleNumber(nums);
        System.out.println(result);

    }

    public static List<Integer> singleNumber(int[] nums) {

        List<Integer> res = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if (res.contains(nums[i])) {
                res.remove((Object)nums[i]);
            } else {
                res.add(nums[i]);
            }
        }

        return res;

    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList();


        List<Integer> result = new ArrayList();
        if (null == root) {
            return result;
        }
        Stack<Node> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curNode = stack.pop();
            if (curNode != null) {
                result.add(curNode.val);
                List<Node> curChild = curNode.children;

                if (curChild != null) {
                    for (int i = curChild.size(); i >= 0; i--) {
                        stack.add(curChild.get(i));
                    }
                }
            }
        }
        return result;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
