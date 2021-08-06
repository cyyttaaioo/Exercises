package com.cyyttaaioo.nowcoder.sfo;

public class JZ44 {
    //双指针
    public String ReverseSentence(String str) {
        str = str.trim(); //去掉首位的空格
        int i = str.length() - 1, j = i;
        StringBuffer sb = new StringBuffer();
        while(i >= 0){
            while(i >= 0 && str.charAt(i) != ' ') i--;
            sb.append(str.substring(i + 1,j + 1)+" ");
            while(i>=0 && str.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString().trim();
    }
}
