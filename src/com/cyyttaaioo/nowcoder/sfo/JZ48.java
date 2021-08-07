package com.cyyttaaioo.nowcoder.sfo;

public class JZ48 {
    //s = a + b = a ^ b + (a & b) << 1, 当 (a & b) << 1 = 0时 s = a ^ b
    public int Add(int num1,int num2) {
        if(num2 == 0)
            return num1;

        return Add(num1 ^ num2, (num1&num2)<<1);
    }
}
