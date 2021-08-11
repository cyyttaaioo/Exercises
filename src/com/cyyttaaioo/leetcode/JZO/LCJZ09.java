package com.cyyttaaioo.leetcode.JZO;

import java.util.*;
public class LCJZ09 {

    Stack<Integer> s1 ,s2;
    public LCJZ09() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        int res = -1;
        if(!s2.isEmpty()){
            res =  s2.pop();
        }else{
            while(!s1.isEmpty())
                s2.push(s1.pop());

            if(!s2.isEmpty())
                res = s2.pop();
        }

        return res;
    }

}
