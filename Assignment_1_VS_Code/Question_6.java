/*
Q6. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true

*/
package Assignment_1_VS_Code;

import java.util.HashSet;

public class Question_6 {// ContainsDuplicate {
          public boolean containsDuplicate(int[] nums) {
                    HashSet<Integer> set = new HashSet<>();

                    for (int num : nums) {
                              // If the set already contains the current element, it means it's a duplicate
                              if (set.contains(num)) {
                                        return true;
                              }

                              // Add the current element to the set
                              set.add(num);
                    }

                    // No duplicates found
                    return false;
          }

          public static void main(String[] args) {
                    int[] nums = { 1, 2, 3, 1 };

                    Question_6 solution = new Question_6();
                    boolean containsDuplicate = solution.containsDuplicate(nums);

                    System.out.println("Contains Duplicate: " + containsDuplicate);
          }
}
