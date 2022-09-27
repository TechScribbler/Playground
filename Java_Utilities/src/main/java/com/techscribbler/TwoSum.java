package com.techscribbler;


import java.text.MessageFormat;
import java.util.HashMap;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]



Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        Integer[] result=twoSum.twoSum(new Integer[]{2,7,11,15},9);
        if(result!=null && result.length>0)
            Logger.getLogger("TwoSum").log(Level.SEVERE, MessageFormat.format("{0}, {1}.",result[0],result[1]));
// MessageFormat.format("{0}, {1}.",result[0],result[1])
    }
    public Integer[] twoSum(Integer[] nums, Integer target) {
        Map<Integer,Integer> parsedInteger=new HashMap<>();
        for(Integer index=0;index<nums.length;index++){
            int delta=target-nums[index];
            if(parsedInteger.containsKey(delta)){
                return new Integer[]{index,parsedInteger.get(delta)};
            }
            parsedInteger.put(nums[index],index);

        }

        return new Integer[]{-1,-1};
    }
}
