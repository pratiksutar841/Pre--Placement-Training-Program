/*   Question 8
You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and 
change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. 
You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0. */
package Assignment_2_VS_Code;

import java.util.Arrays;

public class Question_8 { //MinimumScore 
    public int minimumScore(int[] nums, int k) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int minVal = nums[0];
        int maxVal = nums[n - 1];
        
        if (k == 0) {
            return maxVal - minVal;
        }
        
        int minScore = maxVal - minVal;
        
        for (int i = 0; i < n - 1; i++) {
            int low = nums[i] + k;
            int high = nums[i + 1] - k;
            
            minVal = Math.min(low, nums[0] + k);
            maxVal = Math.max(high, nums[n - 1] - k);
            
            minScore = Math.min(minScore, maxVal - minVal);
        }
        
        return minScore;
    }
    
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        
        Question_8 minimumScore = new Question_8();
        int result = minimumScore.minimumScore(nums, k);
        System.out.println("Minimum score: " + result);
    }
}
