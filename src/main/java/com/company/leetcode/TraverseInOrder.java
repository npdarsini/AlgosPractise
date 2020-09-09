package com.company.leetcode;

import java.util.*;

public class TraverseInOrder {

    public List<List<Integer>> inOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        if (null == root)
            return result;

        List<TreeNode> childNodes = new ArrayList<>();
        List<List<TreeNode>> levelNodes = new ArrayList();
        childNodes.add(root);
        result.add(Arrays.asList(root.val));

        while (childNodes != null) {
            childNodes = getChilds(childNodes);
            if (childNodes != null) result.add(addValues(childNodes));
        }

        return result;

    }

    private List<TreeNode> getChilds(List<TreeNode> childNodes) {

        List<TreeNode> childres = new ArrayList<>();

        for (TreeNode node : childNodes) {
            if (node.left != null) {
                childres.add(node.left);
            }

            if (null != node.right) {
                childres.add(node.right);
            }
        }

        if (childres.size() == 0) {
            return null;
        }

        return childres;
    }

    private List<Integer> addValues(List<TreeNode> childNodes) {

        List<Integer> childVal = new ArrayList<>();
        for (TreeNode node : childNodes) {
            if (null != node)
                childVal.add(node.val);
        }

        return childVal;
    }
}