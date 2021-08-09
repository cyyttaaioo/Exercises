package com.cyyttaaioo.nowcoder.sfo;

import java.util.LinkedList;
import java.util.Queue;

public class JZ54 {
    //Insert one char from stringstream
    int[] charCnt = new int[128];
    Queue<Character> tmp = new LinkedList<>();
    public void Insert(char ch)
    {
        if(charCnt[ch]++ == 0){
            tmp.add(ch);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        Character C = null;
        char c = 0;
        while((C = tmp.peek()) != null){
            c = C.charValue();
            if(charCnt[c] == 1){
                return c;
            }
            tmp.remove();
        }
        return '#';
    }
}
