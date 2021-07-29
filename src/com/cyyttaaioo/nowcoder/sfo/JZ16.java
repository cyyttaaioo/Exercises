package com.cyyttaaioo.nowcoder.sfo;

public class JZ16 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
}
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode h = new ListNode(-1);
        ListNode n = h;

        while(list1 !=null && list2 != null){
            if(list1.val<=list2.val){
                n.next = list1;
                list1 = list1.next;
            }else{
                n.next = list2;
                list2 = list2.next;
            }
            n = n.next;
        }

        if(list1!=null) n.next = list1;
        if(list2!=null) n.next = list2;

        return h.next;
}
