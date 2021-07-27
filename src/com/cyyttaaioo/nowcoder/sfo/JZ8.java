package com.cyyttaaioo.nowcoder.sfo;

public class JZ8 {
    public int jumpFloor(int target) {
        if(target == 1) return 1;
        if(target == 2) return 2;

        int one = 1;
        int two = 2;
        for(int i = 3; i <= target; i++){
            two = two + one;
            one = two - one;
        }
        return two;
    }
}
