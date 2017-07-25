package com.ahsanburney;

import java.util.Arrays;

public class Main {

 //   Given an array of 2n integers,
 //   your task is to group these integers into n pairs of integer,
 //   say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.


    public static void main(String[] args) {
	// write your code here
      int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));

    }


    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}

