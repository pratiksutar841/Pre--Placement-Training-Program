package Assignment_8_VS_Code;
/*   <aside>
💡 **Question 3**

Given two strings word1 and word2, return *the minimum number of **steps** required to make* word1 *and* word2 *the same*.

In one **step**, you can delete exactly one character in either string.

**Example 1:**

**Input:** word1 = "sea", word2 = "eat"

**Output:** 2

**Explanation:** You need one step to make "sea" to "ea" and another step to make "eat" to "ea".

</aside> */

public class Question3 {
    public int minDistance(String word1, String word2) {
        return minSteps(word1, word2, word1.length(), word2.length());
    }

    private int minSteps(String word1, String word2, int m, int n) {
        // Base cases
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }

        // If the last characters are equal, no deletion needed
        if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            return minSteps(word1, word2, m - 1, n - 1);
        }

        // If the last characters are different, consider two options:
        // 1. Delete the last character of word1 and find the minimum steps
        // 2. Delete the last character of word2 and find the minimum steps
        return 1 + Math.min(minSteps(word1, word2, m - 1, n), minSteps(word1, word2, m, n - 1));
    }
}
