package com.cyyttaaioo.nowcoder.sfo;

public class JZ46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0) return -1;
        int x = 0;
        for(int i = 2; i <= n;i++){
            x = (x + m) % i;
        }
        return x;
    }
}
