package com.cyyttaaioo.leetcode.JZO;

public class LCJZ12 {
    public boolean exist(char[][] board, String word) {
        int k = word.length();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length;j++){
                if(dfs(board, i, j, 0, k, word)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board,int i,int j,int m,int k,String word){
        //剪枝
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word.charAt(m)) return false;
        board[i][j] = '\0';
        if(m == k - 1) return true;
        boolean  res = dfs(board, i - 1, j, m + 1, k, word) ||dfs(board, i + 1, j, m + 1, k, word) ||
                dfs(board, i , j - 1, m + 1, k, word) ||dfs(board, i, j + 1 , m + 1, k, word);
        board[i][j] = word.charAt(m);
        return res;
    }
}
