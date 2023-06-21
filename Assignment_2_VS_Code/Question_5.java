/*  Question 5
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
 */
package Assignment_2_VS_Code;


import java.util.Arrays;

public class Question_5 {//MaximumProduct 
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        
        // Maximum product could be either the product of the three largest numbers
        // or the product of the two smallest numbers and the largest number
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(option1, option2);
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Question_5 maxProduct = new Question_5();
        int result = maxProduct.maximumProduct(nums);
        System.out.println("Maximum product: " + result);
    }
}
