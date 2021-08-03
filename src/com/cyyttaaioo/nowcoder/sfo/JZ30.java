package com.cyyttaaioo.nowcoder.sfo;

public class JZ30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0], pre = 0;
        for(int i : array){
            i += Math.max(pre,0);
            pre = i;
            max = Math.max(max,i);
        }
        return max;
    }
}
