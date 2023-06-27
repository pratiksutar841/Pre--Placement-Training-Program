package Assignment_3_VS_Code;
/*  <aside>
💡 **Question 5**
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

</aside> */

import java.util.Arrays;

public class Question5 { // PlusOne
          public static int[] plusOne(int[] digits) {
                    int n = digits.length;

                    // Iterate from the least significant digit
                    for (int i = n - 1; i >= 0; i--) {
                              if (digits[i] < 9) {
                                        // No need to propagate the carry, simply increment the digit and return the
                                        // array
                                        digits[i]++;
                                        return digits;
                              } else {
                                        // Set the current digit to 0 and propagate the carry
                                        digits[i] = 0;
                              }
                    }

                    // If we reach here, it means there is a carry at the most significant digit
                    int[] newDigits = new int[n + 1];
                    newDigits[0] = 1; // Set the most significant digit to 1
                    return newDigits;
          }

          public static void main(String[] args) {
                    int[] digits = { 1, 2, 3 };
                    int[] result = plusOne(digits);
                    System.out.println(Arrays.toString(result));
          }
}
