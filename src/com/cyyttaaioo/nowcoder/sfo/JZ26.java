package com.cyyttaaioo.nowcoder.sfo;

public class JZ26 {
    //中序遍历

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    TreeNode pre, head;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return pRootOfTree;
        dif(pRootOfTree);
        pre.right =null;
        head.left = null;

        return head;
    }
    void dif(TreeNode tree){
        if(tree == null) return;
        dif(tree.left);

        if(pre != null) pre.right = tree;
        else head = tree;

        tree.left = pre;
        pre = tree;

        dif(tree.right);
    }
}
