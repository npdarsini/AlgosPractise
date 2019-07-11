package com.company;

public class MergeBinaryTree {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null && t2 == null){
            return null;
        }

        TreeNode root = new TreeNode(0);

        if(t1 != null && t2 != null) root.val = t1.val + t2.val;
        else if(t1 == null) root.val = t2.val;
        else root.val = t1.val;

        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);


        return root;


    }
}
