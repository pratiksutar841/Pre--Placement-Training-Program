package Assignment_8_VS_Code;
/*   <aside>
💡 **Question 6**

Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. You may return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

**Input:** s = "cbaebabacd", p = "abc"

**Output:** [0,6]

**Explanation:**

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".

</aside> */

import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        
        if (sLen < pLen) {
            return result;
        }
        
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        for (int i = 0; i <= sLen - pLen; i++) {
            int[] sCount = new int[26];
            for (int j = 0; j < pLen; j++) {
                sCount[s.charAt(i + j) - 'a']++;
            }
            
            if (isAnagram(pCount, sCount)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    private boolean isAnagram(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) {
                return false;
            }
        }
        return true;
    }
}
