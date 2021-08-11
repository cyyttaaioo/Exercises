package com.cyyttaaioo.nowcoder.sfo;

public class JZ67 {
    //动态规划
    public int cutRope(int target) {

        int[] dp = new int[target + 1];
        dp[2] = 1;

        for(int i = 3; i < target + 1;i++){
            for(int j = 2; j < i;j++){
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[target];
    }
    //均分
    public int cutRope01(int target) {
        int max = 1;
        for(int i = 2; i < target; i++){// i 表示切分的段数
            int a = target / i; // 平均切分为i段后，每段的长度
            int b = target % i; // 平均切分后剩余的不足一段的绳子，将这些不足的分给其他段一个单位
            max=(int)Math.max(max,Math.pow(a,(i-b)) * Math.pow(a+1,b));
        }
        return max;
    }
}
