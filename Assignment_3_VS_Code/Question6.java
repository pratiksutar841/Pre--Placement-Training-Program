package Assignment_3_VS_Code;
/*  Question 6
Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only
constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1 */

public class Question6 {// SingleNumber
          public static int singleNumber(int[] nums) {
                    int result = 0;

                    for (int num : nums) {
                              result ^= num;
                    }

                    return result;
          }

          public static void main(String[] args) {
                    int[] nums = { 2, 2, 1 };
                    int single = singleNumber(nums);
                    System.out.println(single);
          }
}
