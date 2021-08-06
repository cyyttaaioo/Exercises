package com.cyyttaaioo.nowcoder.sfo;

import java.util.HashSet;

public class JZ45 {
    public boolean IsContinuous(int [] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int  max = 0;
        int min = 13;
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] == 0) continue;
            if(set.contains(numbers[i])) return false;
            max = Math.max(numbers[i],max);
            min = Math.min(numbers[i],min);
            set.add(numbers[i]);
        }

        return  (max - min) < 5;
    }
}
