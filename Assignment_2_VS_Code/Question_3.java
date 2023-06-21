/*   Question 3
We define a harmonious array as an array where the difference between its maximum value
and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence
among all its possible subsequences.

A subsequence of an array is a sequence that can be derived from the array by deleting some or no 
elements without changing the order of the remaining elements.

Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5

Explanation: The longest harmonious subsequence is [3,2,2,2,3]. */
package Assignment_2_VS_Code;

import java.util.HashMap;
import java.util.Map;

public class Question_3 {    //LongestHarmoniousSubsequence 
    public static int findLHS(int[] nums) {
        // Create a frequency map to count the occurrences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int longestSubsequence = 0;
        
        // Iterate over the numbers in the array
        for (int num : nums) {
            // Check if there is a number with a difference of 1 in frequency
            if (frequencyMap.containsKey(num + 1)) {
                int currentSubsequence = frequencyMap.get(num) + frequencyMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
            }
        }
        
        return longestSubsequence;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println(result);
    }
}
