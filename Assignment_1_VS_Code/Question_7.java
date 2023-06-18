/*
Q7. Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

 */
package Assignment_1_VS_Code;



public class Question_7 { // MoveZeroes
          public void moveZeroes(int[] nums) {
                    int n = nums.length;
                    int i = 0; // Pointer for iterating over the array

                    // Move all the nonzero elements to the front of the array
                    for (int num : nums) {
                              if (num != 0) {
                                        nums[i] = num;
                                        i++;
                              }
                    }

                    // Fill the remaining positions with zeros
                    while (i < n) {
                              nums[i] = 0;
                              i++;
                    }
          }

          public static void main(String[] args) {
                    int[] nums = { 0, 1, 0, 3, 12 };

                    Question_7 solution = new Question_7();
                    solution.moveZeroes(nums);

                    System.out.print("Result: ");
                    for (int num : nums) {
                              System.out.print(num + " ");
                    }
                    System.out.println();
          }
}
