package com.cyyttaaioo.nowcoder.sfo;


import java.util.Arrays;

public class JZ4 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //有效值判断
        if(pre.length == 0 || in.length == 0){
            return null;
        }
        //定义结果树
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if(pre[0] == in[i]){
                //结果树的根节点的左子树              左子树的前序遍历                              左子树的中序遍历
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                //结果树的根节点的右子树              右子树的前序遍历                              右子树的中序遍历
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
                //递归之后直接结束for循环
                break;
            }
        }
        return root;
    }

}
