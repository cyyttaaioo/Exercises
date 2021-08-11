package com.cyyttaaioo.leetcode.JZO;

public class LCJZ10 {
    public int fib(int n) {
        if(n == 0 || n == 1) return n;

        int res = 1 , tmp = 0  ,sum;
        for(int i = 2; i <= n ; i++){
            sum = (res + tmp)%1000000007;
            tmp = res;
            res = sum;
        }
        return res;
    }
}
