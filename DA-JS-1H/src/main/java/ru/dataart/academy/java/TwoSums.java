package ru.dataart.academy.java;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        int[] targetNums = new int[2];
        Map<Integer, Integer> hashTable = new HashMap<>();


        if (nums.length < 2) {
            return targetNums;
        }

        for (int i = 0; i < nums.length; i++) {
            if(hashTable.containsKey(nums[i])){
                targetNums[0] = nums[hashTable.get(nums[i])];
                targetNums[1] = nums[i];
                return targetNums;
            }else{
                hashTable.put((target - nums[i]), i);
            }
        }

        return targetNums;
    }
}
