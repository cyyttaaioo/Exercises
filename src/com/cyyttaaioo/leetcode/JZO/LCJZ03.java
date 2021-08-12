package com.cyyttaaioo.leetcode.JZO;

public class LCJZ03 {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i){
                i++;
                continue;
            }
            if(nums[i] == nums[nums[i]]) return nums[i];


            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;

        }
        return -1;
    }
}
