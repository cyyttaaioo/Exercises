package com.cyyttaaioo.leetcode.JZO;

public class LCJZ10_2 {
    public int numWays(int n) {
        if(n == 0|| n == 1) return 1;
        int pre = 1, cur = 2,tmp;
        for(int i = 3; i <= n; i++){
            tmp =(pre + cur)%1000000007;
            pre = cur;
            cur = tmp;
        }
        return cur;

    }
}
