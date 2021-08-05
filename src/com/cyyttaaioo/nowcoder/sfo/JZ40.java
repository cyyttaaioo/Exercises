package com.cyyttaaioo.nowcoder.sfo;

import java.util.HashMap;

public class JZ40 {
    //与运算&都为1结果为1, 异或运算^,不同结果为1，相同结果为0,异或与顺序无关
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        int n = 0; int m = 1;int x = 0;int y = 0;
        //找出只有一个的两个数字的异或结果
        for(int num : array){
            n ^= num;
        }
        //找出它两结果中不同的位数
        while((n & m) == 0) m <<= 1;
                           //m = m << 1
        //根据不同数，将两个数字分别归入两个数组，分别计算
        for(int num :array){
            if((num & m)== 0) x ^= num;
            else y ^= num;
        }

        if(x > y) return new int[] {y , x};
        return new int[] {x,y};
    }
}
