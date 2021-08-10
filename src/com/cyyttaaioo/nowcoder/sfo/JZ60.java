package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;
import java.util.LinkedList;

public class JZ60 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        LinkedList<TreeNode> tmp = new LinkedList<>();
        tmp.add(pRoot);

        while(!tmp.isEmpty()){
            int size =  tmp.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < size;i++){
                TreeNode node = tmp.poll();
                if(node == null) continue;
                list.add(node.val);


                tmp.offer(node.left);
                tmp.offer(node.right);
            }
            if(list.size() != 0)
                res.add(list);
        }

        return res;
    }
}
