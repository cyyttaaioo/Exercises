package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;

public class JZ42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0, j = array.length - 1;
        ArrayList<Integer> res = new ArrayList<>();
        while(i < j){
            int s = array[i] + array[j];
            if(s == sum){
                res.add(array[i]);
                res.add(array[j]);
                return res;
            }else if(s > sum) {j--;}
            else {i++;}


        }
        return res;
    }
}
