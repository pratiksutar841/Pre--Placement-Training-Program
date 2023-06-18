/*
 Q1. Given an array of integers nums and an integer target, return indices of 
     the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example:**
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][

 */
package Assignment_1_VS_Code;
import java.util.HashMap;

public class Question_1 {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in the map, return its index and the current index
            if (complementMap.containsKey(complement)) {
                return new int[] { complementMap.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            complementMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        Question_1 solution = new Question_1();
        int[] indices = solution.twoSum(nums, target);

        System.out.println("[" + indices[0] + ", " + indices[1] + "]");
    }
}
