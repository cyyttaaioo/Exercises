package com.cyyttaaioo.nowcoder.sfo;

public class JZ62 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    int  count;
    TreeNode res;
    TreeNode KthNode(TreeNode pRoot, int k) {
        this.count = k;
        depth(pRoot);
        return res;

    }
    void depth(TreeNode node){
        if(node == null || count == 0) return;
        depth(node.left);
        if(--count == 0){
            res = node;
            return;
        }
        depth(node.right);

    }
}
