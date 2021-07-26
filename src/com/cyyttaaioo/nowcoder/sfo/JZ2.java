package com.cyyttaaioo.nowcoder.sfo;

public class JZ2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace(String s){
        //用StringBuffer来接收结果
        StringBuffer sb = new StringBuffer();
        //将目标字符串变为字符串数组,方便转换
        String[] strs = s.split("");
        //遍历字符串数组进行转换
        for (String str : strs) {
            if(" ".equals(str)){
                sb.append("%20");
            }else{
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
