package Assignment_3_VS_Code;
/*  Question 2
Given an array nums of n integers, return an array of all the unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that:
           ● 0 <= a, b, c, d < n
           ● a, b, c, and d are distinct.
           ● nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {// FourSum
          public static List<List<Integer>> fourSum(int[] nums, int target) {
                    List<List<Integer>> result = new ArrayList<>();

                    if (nums == null || nums.length < 4) {
                              return result;
                    }

                    Arrays.sort(nums); // Sort the array to simplify the process

                    for (int i = 0; i < nums.length - 3; i++) {
                              // Skip duplicate values for the first element
                              if (i > 0 && nums[i] == nums[i - 1]) {
                                        continue;
                              }

                              for (int j = i + 1; j < nums.length - 2; j++) {
                                        // Skip duplicate values for the second element
                                        if (j > i + 1 && nums[j] == nums[j - 1]) {
                                                  continue;
                                        }

                                        int left = j + 1;
                                        int right = nums.length - 1;

                                        while (left < right) {
                                                  int currentSum = nums[i] + nums[j] + nums[left] + nums[right];

                                                  if (currentSum == target) {
                                                            result.add(Arrays.asList(nums[i], nums[j], nums[left],
                                                                                nums[right]));

                                                            // Skip duplicate values for the third and fourth elements
                                                            while (left < right && nums[left] == nums[left + 1]) {
                                                                      left++;
                                                            }
                                                            while (left < right && nums[right] == nums[right - 1]) {
                                                                      right--;
                                                            }

                                                            left++;
                                                            right--;
                                                  } else if (currentSum < target) {
                                                            left++;
                                                  } else {
                                                            right--;
                                                  }
                                        }
                              }
                    }

                    return result;
          }

          public static void main(String[] args) {
                    int[] nums = { 1, 0, -1, 0, -2, 2 };
                    int target = 0;
                    List<List<Integer>> result = fourSum(nums, target);
                    System.out.println(result);
          }
}
