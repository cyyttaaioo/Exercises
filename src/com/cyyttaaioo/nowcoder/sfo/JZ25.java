package com.cyyttaaioo.nowcoder.sfo;

public class JZ25 {
//将新链表节点拼接在原节点后面，最后将两者分开
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) return pHead;
        RandomListNode cur = pHead;

        while(cur != null){
            RandomListNode temp = new RandomListNode(cur.label);
            temp.next = cur.next;
            cur.next =temp;
            cur = temp.next;
        }
        cur = pHead;

        while(cur!=null){
            if(cur.random!=null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }

        cur = pHead.next;
        RandomListNode pre = pHead;
        RandomListNode res = pHead.next;

        while(cur.next !=null){
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return res;
    }
}
