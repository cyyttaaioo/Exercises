package com.cyyttaaioo.nowcoder.sfo;

public class JZ66 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] tmp = new boolean[rows][cols];
        return bfs(tmp, rows, cols, 0, 0, threshold);
    }

    int bfs(boolean[][] tmp, int m, int n, int i, int j, int k){
        if( i >= m || j >= n || tmp[i][j] || bitSum(i) + bitSum(j) > k)  return 0;
        tmp[i][j] = true;

        return 1 + bfs(tmp, m, n, i + 1, j, k) + bfs(tmp, m, n, i, j + 1, k);
    }

    int bitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
