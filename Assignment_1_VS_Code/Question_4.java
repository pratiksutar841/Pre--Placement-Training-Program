/*  
Q4.You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

 */
package Assignment_1_VS_Code;

public class Question_4{//PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by 1
            digits[i]++;
            
            // If the digit is less than 10, there is no carry, so return the updated array
            if (digits[i] < 10) {
                return digits;
            }
            
            // If the digit is 10, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If we reach this point, it means all digits were 9, and we have a carry to the most significant digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the most significant digit to 1
        return result;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };

        Question_4 solution = new Question_4();
        int[] result = solution.plusOne(digits);

        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
