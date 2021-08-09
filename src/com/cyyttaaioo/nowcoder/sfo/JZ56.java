package com.cyyttaaioo.nowcoder.sfo;

public class JZ56 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = pHead;
        ListNode pre = head;
        ListNode cur = pre.next;
        while(cur != null){
            if(cur.next != null && cur.next.val == cur.val){
                while( cur.next != null && cur.next.val == cur.val)
                    cur = cur.next;

                cur = cur.next;

                pre.next = cur;
            }else{
                pre = cur;
                cur = pre.next;
            }
        }
        return head.next;
    }
}
