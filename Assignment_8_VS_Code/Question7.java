package Assignment_8_VS_Code;
/*  <aside>
💡 **Question 7**

Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

**Example 1:**

**Input:** s = "3[a]2[bc]"

**Output:** "aaabcbc"

</aside> */

public class Question7 {
    private int i; // global index for string traversal

    public String decodeString(String s) {
        i = 0; // initialize index to 0
        return decode(s); // call recursive helper function
    }

    private String decode(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        while (i < n && s.charAt(i) != ']') {
            if (Character.isDigit(s.charAt(i))) {
                int k = 0;

                // Extract the number k
                while (i < n && Character.isDigit(s.charAt(i))) {
                    k = k * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i++; // Move past the '[' character

                // Recursive call to decode the substring within the brackets
                String sub = decode(s);

                // Repeat the substring k times
                for (int j = 0; j < k; j++) {
                    sb.append(sub);
                }

                i++; // Move past the ']' character
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}
