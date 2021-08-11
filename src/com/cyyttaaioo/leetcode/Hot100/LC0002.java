package com.cyyttaaioo.leetcode.Hot100;

public class LC0002 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //头节点       //临时节点
        ListNode head = null,tail = null;
        //
        int c = 0;
        while(l1 != null || l2 != null){
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;

            int sum = a + b + c;

            if(head == null) {
                head = tail = new ListNode(sum % 10);
            } else{
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            c = sum / 10;

            if( l1 != null ) l1 = l1.next;
            if( l2 != null ) l2 = l2.next;
        }
        if(c != 0) tail.next = new ListNode(c);
        return head;
    }
}
