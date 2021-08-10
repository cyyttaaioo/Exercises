package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;
import java.util.Collections;

public class JZ59 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
        depth(pRoot,1,list);
        for(int i=0;i<list.size();i++){
            if(i%2!=0){
                Collections.reverse(list.get(i));
            }
        }
        return list;
    }

    void depth(TreeNode node,int depth, ArrayList<ArrayList<Integer> > list){
        if(node == null) return;

        if(depth > list.size()) list.add(new ArrayList<Integer>());

        list.get(depth - 1).add(node.val);
        depth(node.left,depth + 1, list);
        depth(node.right,depth + 1, list);
    }

}
