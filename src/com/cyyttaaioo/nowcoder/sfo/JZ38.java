package com.cyyttaaioo.nowcoder.sfo;

import java.util.LinkedList;

public class JZ38 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
        //BFS 层序遍历 广度遍历
        public int TreeDepth(TreeNode root) {

        if(root == null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while(!queue.isEmpty()){
            LinkedList<TreeNode> temp = new LinkedList<>();

            for(TreeNode node : queue ){
                if(node.left != null) temp.add(node.left);
                if(node.right != null) temp.add(node.right);
            }
            queue = temp;
            res++;
        }
        return res;
    }
    public int TreeDepth1(TreeNode root) {
        if(root == null) return 0;
        return Math.max(TreeDepth1(root.left), TreeDepth1(root.right)) +1;
    }


}
