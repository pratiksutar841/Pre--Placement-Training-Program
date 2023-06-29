package Assignment_4_VS_Code;
 /*   
💡 **Question 1**
Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

**Example 1:**

Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

Output: [1,5]

**Explanation:** Only 1 and 5 appeared in the three arrays.
 */

import java.util.ArrayList;
import java.util.List;

public class Question1 {   // CommonElements 
    public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> commonElements = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        
        int[] result = new int[commonElements.size()];
        for (int index = 0; index < commonElements.size(); index++) {
            result[index] = commonElements.get(index);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        int[] commonElements = findCommonElements(arr1, arr2, arr3);

        System.out.print("Output: [");
        for (int i = 0; i < commonElements.length; i++) {
            System.out.print(commonElements[i]);
            if (i < commonElements.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
