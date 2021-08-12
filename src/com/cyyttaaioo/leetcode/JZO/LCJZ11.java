package com.cyyttaaioo.leetcode.JZO;

public class LCJZ11 {
    public int minArray(int[] numbers) {
        if(numbers.length == 0) return 0;

        //二分法
        int low = 0;
        int high = numbers.length - 1;
        int mid;

        while(low < high){

            if(numbers[low] < numbers[high]) return numbers[low];

            mid = (low + high) >> 1;

            if(numbers[mid] > numbers[high]) low = mid + 1;
            else if(numbers[mid] < numbers[high]) high = mid;
            else low++;
        }
        return numbers[low];

    }
}
