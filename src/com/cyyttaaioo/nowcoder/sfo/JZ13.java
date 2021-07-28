package com.cyyttaaioo.nowcoder.sfo;

import java.util.LinkedList;

import java.util.Queue;


public class JZ13 {
    public int[] reOrderArray (int[] array) {
        // write code here
        if(array.length == 0){
            return array;
        }

            Queue<Integer> JList = new LinkedList();
            Queue<Integer> OList = new LinkedList();

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                OList.add(array[i]);
            }
            else{
                JList.add(array[i]);
            }
        }

        for(int i = 0; i < array.length; i++){
            if(!JList.isEmpty()){
                array[i] = JList.poll();
            }else{
                array[i] = OList.poll();
            }
        }
        return array;
    }
}
