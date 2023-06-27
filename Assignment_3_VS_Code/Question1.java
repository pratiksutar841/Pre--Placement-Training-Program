package Assignment_3_VS_Code;

/* Question 1
Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2

Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2). */

import java.util.Arrays;

public class Question1 {// ThreeSumClosest
          public static int threeSumClosest(int[] nums, int target) {
                    Arrays.sort(nums); // Sort the array to simplify the two-pointer approach
                    int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum with the first three
                                                                  // elements

                    for (int i = 0; i < nums.length - 2; i++) {
                              int left = i + 1;
                              int right = nums.length - 1;

                              while (left < right) {
                                        int currentSum = nums[i] + nums[left] + nums[right];

                                        if (currentSum == target) {
                                                  return currentSum; // Found an exact match, return the sum
                                        }

                                        // Update the closestSum if the current sum is closer to the target
                                        if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                                                  closestSum = currentSum;
                                        }

                                        if (currentSum < target) {
                                                  left++; // Move the left pointer towards the right
                                        } else {
                                                  right--; // Move the right pointer towards the left
                                        }
                              }
                    }

                    return closestSum;
          }

          public static void main(String[] args) {
                    int[] nums = { -1, 2, 1, -4 };
                    int target = 1;
                    int result = threeSumClosest(nums, target);
                    System.out.println(result);
          }
}
