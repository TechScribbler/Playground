package com.techscribbler;

import java.util.Arrays;
import java.util.List;

/*
* Given an integer array nums, move all 0's to the end of it while maintaining the relative order
* of the non-zero elements.
* Note that you must do this in-place without making a copy of the array.
* Example 1:
* ******************************
* Input: nums = [0,1,0,3,12]
* Output: [1,3,12,0,0]
*
* Example 2:
* ******************************
* Input: nums = [0]
* Output: [0]

* Constraints:
* ************************
* 1 <= nums.length <= 104
* -231 <= nums[i] <= 231 - 1
* Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeros {
    public void moveZeroes(Integer[] nums) {
        Arrays.stream(nums).forEach(e->System.out.print(e +" "));
        Integer nextIndex=0;
        for(Integer index=0;index<nums.length;index++){
            if(nums[index]!=0) {
                swap(index, nextIndex, nums);
                nextIndex++;
            }
        }
        Arrays.stream(nums).forEach(e->System.out.print(e +" "));
    }
    void swap(Integer index,Integer nextIndex,Integer[] nums){
        int temp=nums[nextIndex];
        nums[nextIndex]=nums[index];
        nums[index]=temp;
    }
}
