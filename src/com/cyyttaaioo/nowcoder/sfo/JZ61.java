package com.cyyttaaioo.nowcoder.sfo;
import java.util.*;
public class JZ61 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    String Serialize(TreeNode root) {
        if(root == null) return "";
        StringBuffer sb = new StringBuffer();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null){
                sb.append("#").append("!");
            }else {
                sb.append(node.val).append("!");
                queue.add(node.left);
                queue.add(node.right);
            }

        }
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        if (str.equals("")) return null;
        String[] s = str.split("!");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = new TreeNode(Integer.parseInt(s[0]));
        int i = 1;
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode n = queue.poll();
            if(!s[i].equals("#") ){
                n.left = new TreeNode(Integer.parseInt(s[i]));
                queue.add(n.left);
            }
            i++;
            if(!s[i].equals("#")){
                n.right = new TreeNode(Integer.parseInt(s[i]));
                queue.add(n.right);
            }
            i++;
        }

        return node;

    }

}
