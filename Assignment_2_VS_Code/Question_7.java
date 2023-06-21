/*   Question 7
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true */
package Assignment_2_VS_Code;

public class Question_7 { //MonotonicArray 
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
        }
        
        return increasing || decreasing;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        Question_7 monotonicArray = new Question_7();
        boolean result = monotonicArray.isMonotonic(nums);
        System.out.println("Is monotonic? = "  + result);
    }
}
