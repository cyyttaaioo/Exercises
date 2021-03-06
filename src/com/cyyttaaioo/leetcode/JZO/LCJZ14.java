package com.cyyttaaioo.leetcode.JZO;

public class LCJZ14 {
    //动态规划
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;

        for(int i = 3; i < n + 1;i++){
            for(int j = 2;j < i;j++){
                dp[i] = Math.max(dp[i],Math.max((i - j)*j,(j * dp[i - j])));
            }
        }
        return dp[n];
    }
}
