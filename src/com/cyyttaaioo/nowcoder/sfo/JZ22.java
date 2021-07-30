package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
public class JZ22 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            Deque<TreeNode> deque = new LinkedList<>();
            ArrayList<Integer> res = new ArrayList<>();

            if (root == null) {
                return res;
            }

            deque.add(root);

            while (!deque.isEmpty()) {
                TreeNode node = deque.pollFirst();
                res.add(node.val);

                if (node.left != null) deque.addLast(node.left);
                if (node.right != null) deque.addLast(node.right);

            }
            return res;
        }
    }
}