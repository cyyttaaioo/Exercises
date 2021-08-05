package com.cyyttaaioo.nowcoder.sfo;

public class JZ35 {
    int[] nums, temp;
    public int InversePairs(int [] array) {
        this.nums = array;
        temp = new int[nums.length];
        return mereSort( 0, nums.length - 1);
    }
    int mereSort(int left, int right){
        //终止条件
        if( left >= right) return 0;
        //二分
        int mid = (left + right) / 2;

        int res = mereSort(left , mid) + mereSort(mid + 1, right);

        //合并
        int i = left, j = mid + 1;
        for(int k = left; k <= right;k++){
            temp[k] = nums[k];
        }
        for(int k =left; k <=right; k++){
            if(i == mid + 1){
                nums[k] = temp[j++];
            }else if(j == right + 1 || temp[i] <= temp[j]){
                nums[k] = temp[i++];
            }else{//temp[i] > temp[j] 即题目要求
                nums[k] = temp[j++];
                res = (res + mid - i + 1)%1000000007;
                //%1000000007防止数据溢出
            }
        }
        return res;
    }
}
