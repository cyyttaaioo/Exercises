package com.cyyttaaioo.nowcoder.sfo;

public class JZ57 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {


        if(pNode.right != null){
            TreeLinkNode pRight = pNode.right;
            while(pRight.left != null){
                pRight = pRight.left;
            }
            return pRight;
        }
        //下面两种情况可以合并
        if(pNode.next != null && pNode.next.left == pNode) return pNode.next;

        if(pNode.next != null){
            TreeLinkNode pNext = pNode.next;
            while(pNext.next != null && pNext.next.right == pNext) pNext = pNext.next;
            return pNext.next;
        }
        return null;
    }
}
