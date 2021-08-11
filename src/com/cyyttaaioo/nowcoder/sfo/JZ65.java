package com.cyyttaaioo.nowcoder.sfo;

public class JZ65 {
    public boolean hasPath (char[][] matrix, String word) {
        // write code here
        int M = matrix.length;
        int N = matrix[0].length;

        for(int i = 0 ; i < M; i++){
            for(int j = 0 ; j < N; j++){
                if(dfs(matrix, i, j, word, 0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] c, int i, int j, String word, int count){
        //剪枝
        if(i >= c.length || i < 0 ||j >= c[0].length || j < 0 || c[i][j] != word.charAt(count)) return false;
        if(count == (word.length() - 1)) return true;
        c[i][j] = '\0';
        boolean res  = dfs(c, i - 1, j , word , count + 1) || dfs(c, i + 1, j, word, count + 1) ||
                dfs(c, i, j- 1, word , count + 1) || dfs(c, i, j + 1, word, count + 1);
        c[i][j] = word.charAt(count);

        return res;
    }
}
