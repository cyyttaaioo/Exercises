package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;

public class JZ3 {

    public class ListNode {
       int val;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
       }
    }

    ArrayList list = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        //通过递归实现
        if(listNode != null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

}

/*        //利用ArrayList的add方法,前插法,每次都往第一个位置插入数据
        while(listNode!=null){
            list.add(0, listNode.val);
            listNode = listNode.next;
    }
        return list;*/
