package com.cyyttaaioo.nowcoder.sfo;

public class JZ31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        //按位计算即个位上会出现的1的次数。。。。。
        int digit = 1, sum = 0;
        int hight = n / 10, cur = n % 10, low = 0;
        while(hight != 0 || cur != 0){
            if(cur == 0) sum += digit * hight;
            else if(cur == 1) sum += digit * hight + low +1;
            else sum += digit * (hight + 1);

            low = low + cur * digit;
            cur = hight % 10;
            hight /= 10;
            digit = digit * 10;
        }
        return sum;
    }
}
