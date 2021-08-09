package com.cyyttaaioo.nowcoder.sfo;

public class JZ53 {
    public boolean isNumeric (String str) {
        // write code here
        if(str == null || str.length() == 0) return false;
        boolean isNum = false , isDot = false, ise_or_E = false;
        char[] s = str.trim().toCharArray();

        for(int i = 0; i < s.length ; i++){
            if(s[i] >= '0' && s[i] <= '9') {
                isNum = true;
            }else if(s[i] == '.'){
                if(isDot || ise_or_E) return false;
                isDot = true;
            }else if(s[i] == 'e' || s[i] == 'E'){
                if(!isNum || ise_or_E) return false;
                ise_or_E = true;
                isNum = false; // 重置isNum
            }else if(s[i] == '-'||s[i]=='+'){
                if(i!=0&&s[i - 1] != 'e' && s[i - 1] != 'E') return false;
            }else {return false;}


        }
        return isNum;
    }
}
