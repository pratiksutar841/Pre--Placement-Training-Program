package Assignment_8_VS_Code;
/*  <aside>
💡 **Question 1**

Given two strings s1 and s2, return *the lowest **ASCII** sum of deleted characters to make two strings equal*.

**Example 1:**

**Input:** s1 = "sea", s2 = "eat"

**Output:** 231

**Explanation:** Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.

Deleting "t" from "eat" adds 116 to the sum.

At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.

</aside> */

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public int minimumDeleteSum(String s1, String s2) {
        Map<String, Integer> memo = new HashMap<>();
        return helper(s1, s2, s1.length() - 1, s2.length() - 1, memo);
    }

    private int helper(String s1, String s2, int i, int j, Map<String, Integer> memo) {
        if (i < 0)
            return getSum(s2, j);
        if (j < 0)
            return getSum(s1, i);

        String key = i + "-" + j;
        if (memo.containsKey(key))
            return memo.get(key);

        int result;
        if (s1.charAt(i) == s2.charAt(j)) {
            result = helper(s1, s2, i - 1, j - 1, memo);
        } else {
            int deleteS1 = s1.charAt(i) + helper(s1, s2, i - 1, j, memo);
            int deleteS2 = s2.charAt(j) + helper(s1, s2, i, j - 1, memo);
            result = Math.min(deleteS1, deleteS2);
        }

        memo.put(key, result);
        return result;
    }

    private int getSum(String str, int endIndex) {
        int sum = 0;
        for (int i = 0; i <= endIndex; i++) {
            sum += str.charAt(i);
        }
        return sum;
    }
}
