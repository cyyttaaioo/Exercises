package com.cyyttaaioo.nowcoder.sfo;

public class JZ33 {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0 ) return 0;
        int i2=0,i3=0,i5=0;
        int[] dp = new int[index];
        dp[0] = 1;
        for(int i = 1;i < index;i++){
            int n2 = dp[i2] * 2;int n3 = dp[i3] * 3; int n5 = dp[i5] * 5;
            dp[i] = Math.min(Math.min(n2,n3),n5);
            if(dp[i] == n2) i2++;
            if(dp[i] == n3) i3++;
            if(dp[i] == n5) i5++;
        }
        return dp[index-1];
    }
}
