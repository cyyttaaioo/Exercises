package com.cyyttaaioo.nowcoder.sfo;

import java.util.Stack;

public class JZ14 {

      public class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
          this.val = val;
        }
      }
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // 双指针。利用两个指针来制造一个范围为k的区间，当这个区间走到末尾是区间内的链表即是结果
//        if(pHead == null){
//            return null;
//        }
//
//        ListNode first = pHead;
//        ListNode second = pHead;
//
//        for (int i = 0; i < k; i++) {
//            if(first == null){
//                return null;
//            }
//            first = first.next;
//        }
//
//        while(first != null){
//            first = first.next;
//            second = second.next;
//        }
//        return second;
        //栈，先全部入栈，再按K出栈，前插法
        Stack<ListNode> listNodes = new Stack<>();
        int count = 0;
        while(pHead != null){
            listNodes.push(pHead);
            pHead = pHead.next;
            count++;
        }
        if(count < k || k  == 0){
            return null;
        }

        ListNode n = listNodes.pop();

        while(--k > 0){
            ListNode temp =  listNodes.pop();
            temp.next = n;
            n = temp;
        }
        return n;



    }
}
