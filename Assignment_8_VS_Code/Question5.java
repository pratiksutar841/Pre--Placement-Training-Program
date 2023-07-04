package Assignment_8_VS_Code;
/*  <aside>
💡 **Question 5**

Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of **consecutive repeating characters** in chars:

- If the group's length is 1, append the character to s.
- Otherwise, append the character followed by the group's length.

The compressed string s **should not be returned separately**, but instead, be stored **in the input character array chars**. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done **modifying the input array,** return *the new length of the array*.

You must write an algorithm that uses only constant extra space.

**Example 1:**

**Input:** chars = ["a","a","b","b","c","c","c"]

**Output:** Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

**Explanation:**

The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

</aside> */

public class Question5 {
    public int compress(char[] chars) {
        return compressHelper(chars, 0, 0);
    }
    
    private int compressHelper(char[] chars, int index, int count) {
        if (index >= chars.length) {
            return count;
        }
        
        int start = index;
        while (index < chars.length && chars[index] == chars[start]) {
            index++;
        }
        
        chars[count++] = chars[start];
        if (index - start > 1) {
            String countStr = String.valueOf(index - start);
            for (char c : countStr.toCharArray()) {
                chars[count++] = c;
            }
        }
        
        return compressHelper(chars, index, count);
    }
}
