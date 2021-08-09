package com.cyyttaaioo.nowcoder.sfo;

public class JZ52 {
    public static boolean match (String str, String pattern) {
        // write code here
        //含两个字符串空串的情况
        int m = str.length() + 1;
        int n = pattern.length() + 1;
        boolean[][] dp = new boolean[m][n];
        //初始化
        dp[0][0] = true;
        for(int i = 2; i < n; i+=2){
            //a*b*c*
            dp[0][i] = dp[0][i - 2] && pattern.charAt(i - 1) =='*';
        }
        for(int i = 1 ; i < m ;i++){
            for(int j = 1; j < n; j++){
                if(pattern.charAt(j - 1) =='*'){
                    if(dp[i][j - 2]) dp[i][j] = true;                                            // 1.
                    else if(dp[i - 1][j] && str.charAt(i - 1) == pattern.charAt(j - 2)) dp[i][j] = true; // 2.
                    else if(dp[i - 1][j] && pattern.charAt(j - 2) == '.') dp[i][j] = true;
                }else{
                    if(dp[i - 1][j - 1] && str.charAt(i - 1) == pattern.charAt(j - 1)) dp[i][j] = true;
                    else if(dp[i - 1][j - 1] && pattern.charAt(j - 1) == '.') dp[i][j] = true;

                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        boolean r = (match("aaa", "aa"));
    }
}
