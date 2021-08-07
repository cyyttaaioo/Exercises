package com.cyyttaaioo.nowcoder.sfo;

public class JZ51 {
    public int[] multiply(int[] A) {
        int len = A.length;
        if(len == 0) return A;
        int[] res = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = right[len - 1] = 1;

        for(int i = 1;i < len; i++){
            left[i] = left[i - 1] * A[i - 1];
        }

        for(int i = len - 2 ; i >= 0;i--){
            right[i] = right[i + 1] * A[i + 1];
        }

        for(int i = 0;i < len ; i++){
            res[i] = left[i] * right[i];
        }

        return res;
    }
}
