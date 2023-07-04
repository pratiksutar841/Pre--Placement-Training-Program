package Assignment_8_VS_Code;
/*  <aside>
💡 **Question 2**

Given a string s containing only three types of characters: '(', ')' and '*', return true *if* s *is **valid***.

The following rules define a **valid** string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

**Example 1:**

**Input:** s = "()"

**Output:**

true

</aside> */

public class Question2 {
    public boolean checkValidString(String s) {
        return isValid(s, 0, 0);
    }

    private boolean isValid(String s, int index, int count) {
        if (index == s.length()) {
            return count == 0;
        }

        if (count < 0) {
            return false;
        }

        char ch = s.charAt(index);
        if (ch == '(') {
            return isValid(s, index + 1, count + 1);
        } else if (ch == ')') {
            return isValid(s, index + 1, count - 1);
        } else { // ch == '*'
            // Consider '*' as '('
            boolean option1 = isValid(s, index + 1, count + 1);
            // Consider '*' as ')'
            boolean option2 = isValid(s, index + 1, count - 1);
            // Consider '*' as an empty string
            boolean option3 = isValid(s, index + 1, count);

            return option1 || option2 || option3;
        }
    }
}
