package com.cyyttaaioo.leetcode.JZO;

public class LCJZ04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //右下角

        int row = matrix.length - 1, col = 0;

        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] > target){
                row--;
            }else if(matrix[row][col] < target){
                col++;
            }else return true;
        }
        return false;
    }
}
