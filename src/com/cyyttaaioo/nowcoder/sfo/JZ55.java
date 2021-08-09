package com.cyyttaaioo.nowcoder.sfo;

public class JZ55 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead) {

        ListNode fast = pHead, slow = pHead;
        while(true){
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) break;
        }
        fast = pHead;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
