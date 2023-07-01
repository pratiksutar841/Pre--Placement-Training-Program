package Assignment_6_VS_Code;
/* <aside>
💡 **Question 4**

Given a binary array nums, return *the maximum length of a contiguous subarray with an equal number of* 0 *and* 1.

**Example 1:**

**Input:** nums = [0,1]

**Output:** 2

**Explanation:**

[0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

</aside> */

import java.util.*;

public class Question4 {//ContiguousSubarray {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;

            if (sumMap.containsKey(sum)) {
                int length = i - sumMap.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                sumMap.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Question4  solution = new Question4 ();
        int[] nums = {0, 1};
        int maxLength = solution.findMaxLength(nums);
        System.out.println(maxLength);
    }
}
