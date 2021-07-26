package com.cyyttaaioo.nowcoder.sfo;
//利用有序的条件
public class JZ1 {
    public boolean Find(int target, int[][] arr){
        //判断行数是否有效
        int rows = arr.length;
        if(rows == 0){
            return false;
        }
        //判断列数是否有效
        int cols = arr[0].length;
        if(cols == 0){
            return false;
        }
        //利用有序，从左下开始判断
        int row = rows - 1;
        int col = 0;

        while(col < cols && row >= 0){
            //比目标小就横坐标向右移
            if(target > arr[row][col]){
                col++;
            //比目标大就纵坐标向上移
            } else if (target < arr[row][col]){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }
}
