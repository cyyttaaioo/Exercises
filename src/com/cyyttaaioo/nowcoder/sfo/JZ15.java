package com.cyyttaaioo.nowcoder.sfo;

import java.util.Stack;

public class JZ15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> listNodes = new Stack<>();

        while (head != null) {
            listNodes.push(head);
            head = head.next;
        }
        ListNode n = listNodes.pop();
        ListNode dummy = n;
        while (!listNodes.isEmpty()) {


            n.next = listNodes.pop();
            n = n.next;

        }
        n.next = null;
        return dummy;

        /*ListNode  newHead = null;
        ListNode  temp = null;
        while(head != null){
            temp = head.next;

            head.next = newHead;

            newHead = head;

            head = temp;

        }
        return newHead;*/

    }
}