/*
Q8. You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
    due to some error, one of the numbers in s got duplicated to another number in the set, which results in 
    repetition of one number and loss of another number.
    You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

 */
package Assignment_1_VS_Code;


import java.util.HashSet;

public class Question_8 {//FindErrorNums 
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;
        int duplicate = 0;
        int sum = (n * (n + 1)) / 2; // Sum of 1 to n

        for (int num : nums) {
            // If the set already contains the current number, it is the duplicate
            if (set.contains(num)) {
                duplicate = num;
            }
            
            sum -= num; // Subtract the current number from the sum
            set.add(num); // Add the current number to the set
        }

        result[0] = duplicate; // The number that occurs twice
        result[1] = sum + duplicate; // The missing number

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };

        Question_8 solution = new Question_8();
        int[] result = solution.findErrorNums(nums);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
