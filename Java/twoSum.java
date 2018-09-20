/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.Arrays;

public class Solution {
     public int[] twoSum(int[] nums, int target) {
        int[] arrayTargetIndices = new int[2];
        for(int i=0;i<nums.length;i++){
            int value1 = nums[i];
            int value2 = nums[i+1];
            int sum = value1 + value2;
            if(Integer.compare(sum,target) == 0){
                arrayTargetIndices[0] = i;
                arrayTargetIndices[1] = i+1;
                break;
            }
            
        }
        return arrayTargetIndices;
    }


    public static void main(String[] args){
            int[] nums = new int[] {11, 12, 13, 14, 15};
      		int target = 27;
            int[] ret = new Solution().twoSum(nums, target);
            System.out.print(Arrays.toString(ret));
        
    }
}

