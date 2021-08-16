package com.cyyttaaioo.leetcode.JZO;

import java.util.HashMap;

public class LCJZ07 {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    int[] preorder;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return recur(0,0,inorder.length - 1);


    }
    TreeNode recur(int pre_root,int in_left,int in_right){
        if(in_left  > in_right) return null;
        TreeNode node = new TreeNode(preorder[pre_root]);
        int i = map.get(preorder[pre_root]);
        node.left = recur(pre_root + 1, in_left, i - 1);
        node.right = recur(pre_root + (i - in_left) + 1, i +1, in_right);
        return node;

    }
}
