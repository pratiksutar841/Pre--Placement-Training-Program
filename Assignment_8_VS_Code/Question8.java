package Assignment_8_VS_Code;
/* <aside>
💡 **Question 8**

Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

**Example 1:**

**Input:** s = "ab", goal = "ba"

**Output:** true

**Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

</aside>  */

public class Question8 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        if (s.equals(goal)) {
            // Check if there are at least two identical characters in the string
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] >= 2) {
                    return true;
                }
            }
            return false;
        }
        
        int n = s.length();
        int first = -1;
        int second = -1;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    // More than two positions need swapping
                    return false;
                }
            }
        }
        
        if (first != -1 && second != -1) {
            // Swap the characters at the first and second positions
            String swapped = swapChars(s, first, second);
            if (swapped.equals(goal)) {
                return true;
            }
        }
        
        return false;
    }
    
    private String swapChars(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
