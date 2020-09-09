package com.company.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PathSumTree {

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }

        if(root.val == sum){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> storeMap = new HashMap<>();
        queue.add(root);
        storeMap.put(root, root.val);

        while (!queue.isEmpty()){
            TreeNode cur = ((LinkedList<TreeNode>) queue).pop();
            if(cur.left != null){
                int sumVal = storeMap.get(cur)+cur.left.val;
                if(sumVal == sum){
                    return true;
                }else {
                    queue.add(cur.left);
                    storeMap.put(cur.left, sumVal);
                }
            }

            if(cur.right != null){
                int sumVal = storeMap.get(cur)+cur.right.val;
                if(sumVal == sum){
                    return true;
                }else {
                    queue.add(cur.right);
                    storeMap.put(cur.right, sumVal);
                }
            }

        }
        return false;
    }
}
