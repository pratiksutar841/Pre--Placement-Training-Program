package Assignment_5_VS_Code;
/*  <aside>
💡 **Question 6**

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer 
appears **once** or **twice**, return *an array of all the integers that appears **twice***.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

**Example 1:**

**Input:** nums = [4,3,2,7,8,2,3,1]

**Output:**

[2,3]

</aside> */
 import java.util.ArrayList;
import java.util.List;
public class Question6 {
         

public List<Integer> findDuplicates(int[] nums) {
    List<Integer> result = new ArrayList<>();

    for (int num : nums) {
        int index = Math.abs(num) - 1;

        if (nums[index] < 0) {
            result.add(Math.abs(num));
        } else {
            nums[index] *= -1;
        }
    }

    return result;
}

}
