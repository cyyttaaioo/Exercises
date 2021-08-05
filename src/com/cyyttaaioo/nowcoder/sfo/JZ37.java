package com.cyyttaaioo.nowcoder.sfo;

public class JZ37 {
    public int GetNumberOfK(int [] array , int k) {
        //找右边界
        return findRight(array,k) - findRight(array, k -1);
    }
    int findRight(int[] arr, int tar){
        int i = 0, j = arr.length - 1;
        while(i <= j ){
            int mid = (i + j) / 2;
            if(arr[mid]  <= tar ) i = mid + 1;
            else j = mid - 1;
        }
        return i;
    }
}
