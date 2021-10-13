package com.example.mypackage;

import java.util.Arrays;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

public class Main {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    public static int[] moveZeroes(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] == 0)
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
        return nums;
    }
    
}

