package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class JZ64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if(num == null || size == 0 || size>num.length) return  list;
        Deque<Integer> deque = new LinkedList<>();


        //未形成窗口
        for(int i = 0; i < size; i++){
            while(!deque.isEmpty() && deque.peekLast() < num[i] ) deque.removeLast();
            deque.addLast(num[i]);
        }
        list.add(deque.peekFirst());
        //形成窗口
        for(int i = size; i < num.length; i++){
            if(deque.peekFirst() == num[i - size]) deque.removeFirst();

            while(!deque.isEmpty() && deque.peekLast() < num[i]) deque.removeLast();
            deque.addLast(num[i]);
            list.add(deque.peekFirst());
        }
        return list;
    }
}
