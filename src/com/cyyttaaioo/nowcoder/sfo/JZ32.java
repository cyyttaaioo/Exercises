package com.cyyttaaioo.nowcoder.sfo;

public class JZ32 {
    public String PrintMinNumber(int [] numbers) {
        String[] str = new String[numbers.length];
        for(int i = 0; i < numbers.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }
        quickSort(str , 0, str.length - 1);
        StringBuffer res = new StringBuffer();
        for(String s : str){
            res.append(s);
        }
        return res.toString();


    }
    void quickSort(String[] str, int l, int r){
        if(l >= r) return;
        int i = l, j = r;
        String temp = str[i];
        while(i < j){
            while((str[j] + str[l]).compareTo(str[l] +str[j]) >= 0 && i < j) j--;
            while((str[i] + str[l]).compareTo(str[l] +str[i]) <= 0 && i < j) i++;
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        str[i] = str[l];
        str[l] = temp;
        quickSort(str, l, i -1);
        quickSort(str, i+1, r);
    }
}
