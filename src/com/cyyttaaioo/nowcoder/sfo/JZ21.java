package com.cyyttaaioo.nowcoder.sfo;

import java.util.Stack;

public class JZ21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> s = new Stack<>();

        int j = 0;
        for(int i = 0; i < pushA.length; i++){
            s.push(pushA[i]);

            while(!s.isEmpty() && s.peek() == popA[j]){
                s.pop();
                j++;
            }
        }
        return s.isEmpty();

    }
}
