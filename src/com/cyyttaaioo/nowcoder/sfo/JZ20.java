package com.cyyttaaioo.nowcoder.sfo;

import java.util.Stack;

public class JZ20 {
    //用来存放所有元素
    Stack<Integer> s1 = new Stack<>();
    //用来存放最小元素并将其一直置于栈顶
    Stack<Integer> s2 = new Stack<>();

    public void push(int node) {
        s1.push(node);
        if(s2.isEmpty() || s2.peek() >= node){
            s2.push(node);
        }
    }

    public void pop() {
        if(s1.pop().equals(s2.peek())){
            s2.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
