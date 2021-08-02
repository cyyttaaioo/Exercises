package com.cyyttaaioo.nowcoder.sfo;

public class JZ28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int num = 0;
        int sum = 0;
        for(int i : array){
            if(sum==0) num = i;
            sum = sum + (num==i?1 :-1);
        }

        return num;
    }
}
