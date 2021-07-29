package com.cyyttaaioo.nowcoder.sfo;

public class JZ18 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null) return pRoot;

        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
