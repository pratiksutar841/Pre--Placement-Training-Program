package Assignment_6_VS_Code;
/*  <aside>
💡 **Question 1**

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2]

</aside> */

import java.util.*;

public class Question1 {//PermutationReconstruction 
    public int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];

        // Initialize the permutation with values from 0 to n
        for (int i = 0; i <= n; i++) {
            perm[i] = i;
        }

        // Reconstruct the permutation based on the given string
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                // Reverse the subarray from i to its next increasing element
                reverse(perm, i, i + 1);
            }
        }

        return perm;
    }

    private void reverse(int[] perm, int start, int end) {
        while (start < end) {
            int temp = perm[start];
            perm[start] = perm[end];
            perm[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Question1  solution = new Question1 ();
        String s = "IDID";
        int[] perm = solution.findPermutation(s);
        System.out.println(Arrays.toString(perm));
    }
}
