package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;

public class JZ19 {

        public ArrayList<Integer> printMatrix(int [][] matrix) {

            ArrayList<Integer> list = new ArrayList<>();

            if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
                return list;
            }

            int up = 0;
            int down = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;


            while(true){
                //输出最上面一行
                for(int col = left; col <= right; col++){
                    list.add(matrix[up][col]);
                }
                //上行范围下移一位
                up++;
                if(up > down) break;

                //输出最右边一列
                for(int row = up ; row  <= down; row++){
                    list.add(matrix[row][right]);
                }
                right--;
                if(right < left) break;

                //输出最下面一行
                for(int col = right; col >= left; col--){
                    list.add(matrix[down][col]);
                }
                down--;
                if(down < up) break;

                //输出最左边一列
                for(int row = down; row >= up; row--){
                    list.add(matrix[row][left]);
                }
                left++;
                if(left > right) break;
            }
            return list;


        }
}
