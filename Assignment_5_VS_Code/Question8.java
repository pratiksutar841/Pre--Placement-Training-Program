package Assignment_5_VS_Code;
/*  <aside>
💡 **Question 8**

An integer array original is transformed into a **doubled** array changed by 
appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. 
If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].

</aside> */

          

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Question8 {
public List<Integer> findOriginalArray(int[] changed) {
    if (changed.length % 2 != 0) {
        return new ArrayList<>(); // If the length is odd, return an empty array
    }

    Map<Integer, Integer> countMap = new HashMap<>();
    for (int num : changed) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    List<Integer> original = new ArrayList<>();
    for (int num : changed) {
        if (countMap.containsKey(num) && countMap.get(num) > 0) {
            int divided = num / 2;
            if (countMap.containsKey(divided) && countMap.get(divided) > 0) {
                original.add(divided);
                countMap.put(divided, countMap.get(divided) - 1);
            } else {
                return new ArrayList<>(); // If the divided element does not exist or count is 0, return an empty array
            }
        }
    }

    return original;
}
}