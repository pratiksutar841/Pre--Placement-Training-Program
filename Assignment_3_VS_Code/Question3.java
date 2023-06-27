package Assignment_3_VS_Code;
/*  <aside>
💡 **Question 3**
A permutation of an array of integers is an arrangement of its members into a
sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr:
[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

The next permutation of an array of integers is the next lexicographically greater
permutation of its integer. More formally, if all the permutations of the array are
sorted in one container according to their lexicographical order, then the next
permutation of that array is the permutation that follows it in the sorted container.

If such an arrangement is not possible, the array must be rearranged as the
lowest possible order (i.e., sorted in ascending order).

● For example, the next permutation of arr = [1,2,3] is [1,3,2].
● Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
● While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory.

**Example 1:**
Input: nums = [1,2,3]
Output: [1,3,2]

</aside> */

public class Question3 { // NextPermutation
          public static void nextPermutation(int[] nums) {
                    int n = nums.length;
                    int i = n - 2;

                    // Find the first element that can be modified
                    while (i >= 0 && nums[i] >= nums[i + 1]) {
                              i--;
                    }

                    if (i >= 0) {
                              int j = n - 1;

                              // Find the next greater element
                              while (j >= 0 && nums[i] >= nums[j]) {
                                        j--;
                              }

                              swap(nums, i, j);
                    }

                    reverse(nums, i + 1, n - 1);
          }

          private static void swap(int[] nums, int i, int j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
          }

          private static void reverse(int[] nums, int left, int right) {
                    while (left < right) {
                              swap(nums, left, right);
                              left++;
                              right--;
                    }
          }

          public static void main(String[] args) {
                    int[] nums = { 1, 2, 3 };
                    nextPermutation(nums);
                    for (int num : nums) {
                              System.out.print(num + " ");
                    }
          }
}
