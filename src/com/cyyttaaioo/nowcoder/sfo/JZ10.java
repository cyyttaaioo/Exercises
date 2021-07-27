package com.cyyttaaioo.nowcoder.sfo;

public class JZ10 {
//动态规划
    public int rectCover(int target) {

        if(target <=2){
            return target;
        }

        int one = 1;
        int two = 2;

        for(int i = 3; i <= target;i++){
            two = two + one;
            one = two - one;
        }
        return two;
    }

}
