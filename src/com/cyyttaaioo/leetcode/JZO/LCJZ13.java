package com.cyyttaaioo.leetcode.JZO;

public class LCJZ13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] map = new boolean[m][n];
        return count(map, 0, 0, k);


    }
    int count(boolean[][] map, int i, int j, int k){
        if(i >= map.length || j >= map[0].length || map[i][j] || sum(i) + sum(j) > k ) return 0;
        map[i][j] = true;
        return 1 + count(map,i + 1, j , k) + count(map , i, j + 1, k);


    }
    int sum(int i){
        int a = 0;
        while(i != 0){
            a = a + i % 10;
            i /= 10;
        }
        return a;
    }

}
