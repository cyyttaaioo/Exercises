package com.cyyttaaioo.nowcoder.sfo;

public class JZ6 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }

        int low = 0;
        int high = array.length - 1;
        int mid ;
        while (low < high){
            //即已经是递增的情况，直接返回最前面的值
            if(array[low] < array[high]){
                return array[low];
            }

            mid = (low + high) >> 1;

            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] < array[high]){
                //此时的mid的值也可能为最小值
                high = mid;
            }else{
                //1,0,1,1,1这种类似的特殊情况
                low++;
            }
        }
        return array[low];
    }
}
