package com.cyyttaaioo.nowcoder.sfo;

public class JZ36 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) return null;
        ListNode pA = pHead1, pB = pHead2;
        while(pA != pB){
            pA = pA == null ? pHead2 : pA.next;
            pB = pB == null ? pHead1 : pB.next;
        }
        return pA;
    }
}
