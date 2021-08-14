package com.cyyttaaioo.leetcode.JZO;

import java.util.ArrayList;

public class LCJZ06 {

 public class ListNode {
     int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0 ; i < tmp.size(); i ++){
            res[i] = tmp.get(i);
        }
        return res;

    }

    void recur(ListNode node){
        if(node == null) return;
        recur(node.next);
        tmp.add(node.val);
    }
}
