package com.cyyttaaioo.nowcoder.sfo;

public class JZ43 {
    //字符串切片
//    public String LeftRotateString(String str,int n) {
//        if(str.length() == 0) return "";
//        return str.substring(n, str.length()) + str.substring(0, n);
//    }
    public String LeftRotateString(String str,int n) {
        StringBuffer res = new StringBuffer();
        for(int i = n ; i< n + str.length(); i++){
            res.append(str.charAt(i % str.length()));
        }
        return res.toString();
    }
}
