package com.cyyttaaioo.nowcoder.sfo;
import com.cyyttaaioo.nowcoder.sfo.JZ38.TreeNode;

public class JZ39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return resu(root) !=-1;
    }
    int resu(TreeNode root){
        if(root == null) return 0;
        int left = resu(root.left);
        if(left == -1) return -1;
        int right = resu(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left,right) + 1 : -1;
    }
}
