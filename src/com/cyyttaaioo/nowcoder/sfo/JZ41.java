package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;

public class JZ41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int i = 1, j = 2 , s = 3;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while(i < j){
            if(s == sum){
                ArrayList<Integer> rs = new ArrayList<>();
                for(int k  = i;k <= j; k++) rs.add(k);

                res.add(rs);

            }

            if(s >= sum){
                s -= i;
                i++;
            }else{
                j++;
                s += j;

            }

        }
        return res;
    }
}
