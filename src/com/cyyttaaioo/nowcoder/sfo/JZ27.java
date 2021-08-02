package com.cyyttaaioo.nowcoder.sfo;

import java.util.ArrayList;
import java.util.HashSet;

public class JZ27 {
    //回溯法
    ArrayList<String> res = new ArrayList<>();
    char[] c;
    public ArrayList<String> Permutation(String str) {
        c = str.toCharArray();
        dif(0);
        return res;

    }
    void dif(int x){
        if(x == c.length - 1){
            res.add(String.valueOf(c));
            return;
        }
        //去重，剪枝
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length ; i++){
            if(set.contains(c[i])) continue;

            set.add(c[i]);
            swap(i,x);
            dif(x + 1);
            swap(i,x);
        }
    }
    void swap(int a, int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
