package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PreOrderTraversal {

    public List<Integer> preorderTraversalFunc(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        if (null == root) {
            return result;
        }

        queue.add(root);
        result.add(root.val);

        while (!queue.isEmpty()) {
            root = queue.peek();
            if (root.left != null) {
                queue.add(root.left);
            } else if (root.right != null) {
                TreeNode add = ((LinkedList<TreeNode>) queue).pop();
                queue.add(add.right);
            } else {
                ((LinkedList<TreeNode>) queue).pop();
            }
            result.add(root.val);
        }

        return result;

    }
}

