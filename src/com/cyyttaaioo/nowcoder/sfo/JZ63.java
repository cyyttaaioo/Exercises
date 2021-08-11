package com.cyyttaaioo.nowcoder.sfo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JZ63 {
    private int cnt = 0;

    private PriorityQueue<Integer> low = new PriorityQueue<>();
    private PriorityQueue<Integer> high = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    public void Insert(Integer num) {
         cnt++;

         if((cnt & 1) == 1){
             if(!low.isEmpty() && num > low.peek()){
                 low.offer(num);
                 num = low.poll();
             }
             high.offer(num);
         }else{
             if(!high.isEmpty() && num < high.peek()){
                 high.offer(num);
                 num = high.poll();
             }
             low.offer(num);
         }

    }

    public Double GetMedian() {
           double res = 0;
           if((cnt & 1)==1){
               return Double.valueOf(high.peek());
           }else{
               res = (high.peek() + low.peek()) / 2.0;
           }
        return res;
    }

}
