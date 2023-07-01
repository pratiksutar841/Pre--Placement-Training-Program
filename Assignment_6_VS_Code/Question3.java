package Assignment_6_VS_Code;
/*  Given an array of integers arr, return *true if and only if it is a valid mountain array*.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
    - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

*Example 1:**

**Input:** arr = [2,1]

**Output:**

false */

public class  Question3 {//ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        
        if (n < 3) {
            return false;
        }
        
        int i = 0;
        
        // Walk up the mountain
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        
        // Peak cannot be at the beginning or end
        if (i == 0 || i == n - 1) {
            return false;
        }
        
        // Walk down the mountain
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        
        // If we reach the end, it is a valid mountain array
        return i == n - 1;
    }

    public static void main(String[] args) {
        Question3 solution = new Question3 ();
        int[] arr = {2, 1};
        boolean isValidMountain = solution.validMountainArray(arr);
        System.out.println(isValidMountain);
    }
}
