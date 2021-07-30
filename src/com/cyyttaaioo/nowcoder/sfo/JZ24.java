package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;

public class JZ24 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        resc(root, target);
        return res;
    }

    void resc(TreeNode root, int tar){
        if(root == null) return;
        temp.add(root.val);
        tar -=root.val;

        if(tar==0 && root.left == null && root.right == null){
            res.add(new ArrayList<Integer>(temp));
        }
        resc(root.left, tar);
        resc(root.right, tar);

        temp.remove(temp.size() - 1);
    }

 }
}
