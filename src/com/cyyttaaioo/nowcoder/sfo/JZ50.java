package com.cyyttaaioo.nowcoder.sfo;

public class JZ50 {
       //交换地址
    public int duplicate (int[] numbers) {
        // write code here
        int i = 0;
        while(i < numbers.length){
            if(numbers[i] == i){
                i++;
                continue;
            }
            if(numbers[i] == numbers[numbers[i]]) return numbers[i];

            int temp = numbers[i];
            numbers[i] = numbers[temp];
            numbers[temp] = temp;
        }
        return -1;
    }
}
