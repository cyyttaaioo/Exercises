package com.cyyttaaioo.nowcoder.sfo;

import java.util.Stack;

public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //入队列时，现存放在第一个栈
    public void push(int node) {
       stack1.push(node);
    }

    //出队列时，将第一个栈的元素放入第二个栈
    public int pop() {

            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
    }
}

