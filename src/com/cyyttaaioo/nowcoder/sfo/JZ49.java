package com.cyyttaaioo.nowcoder.sfo;

public class JZ49 {
    public int StrToInt(String str) {
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 0 , sign = 1, length = str.length();
        if(length == 0) return 0;
        while(str.charAt(i) == ' '){
            //判断是否是有效的字符串，是不是全是' '，同时去除开始部分的' '
            if(++i == length) return 0;
        }
        if(str.charAt(i) == '-') sign = -1;
        //如果有符号位则向后移一位
        if(str.charAt(i) == '-' || str.charAt(i) == '+') i++;
        for(int j = i;j < length; j++){
            if(str.charAt(j) > '9' || str.charAt(j) < '0') return 0;
            if(res > bndry || res == bndry && str.charAt(j) > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (str.charAt(j) - '0');
        }
        return sign * res;
    }
}
