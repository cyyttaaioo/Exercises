package com.cyyttaaioo.nowcoder.sfo;

public class JZ58 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    boolean isSymmetrical(TreeNode pRoot) {
        return pRoot == null ? true : recur(pRoot.left, pRoot.right);
    }

    boolean recur(TreeNode L, TreeNode R){
        if(L == null && R == null) return true;
        if(L == null || R == null || R.val != L.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}
