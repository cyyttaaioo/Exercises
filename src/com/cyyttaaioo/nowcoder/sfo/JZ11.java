package com.cyyttaaioo.nowcoder.sfo;

public class JZ11 {
    public int NumberOf1(int n) {
        //常规做法
        /*String s = Integer.toBinaryString(n);
        String[] string = s.split("");

        int count = 0;

        for (String s1 : string) {
            if("1".equals(s1)){
                count++;
            }
        }
        return count;*/

        int count = 0;
        //二进制数 - 1 会使数的最右边的 1 变为 0 ，其之后的0（如果有0的话）都会变为 1，其它位数不受影响
        //eg 1100 - 1 = 1011
        //当我们将原数与减一后的数进行 & （两个操作数中位都为1，结果才为1，否则结果为0）运算后 会发现只最右边的 1 变为了0
        // 1100 & 1011 = 1000
        //一次操作后 1 的数量少了一个
        while(n!=0){

            count++;

            n = n&(n-1);
        }
        return count;
    }
}
