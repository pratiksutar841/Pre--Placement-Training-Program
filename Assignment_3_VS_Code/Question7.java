package Assignment_3_VS_Code;
/*  Question 7
You are given an inclusive range [lower, upper] and a sorted unique integer array
nums, where all elements are within the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in
nums.

Return the shortest sorted list of ranges that exactly covers all the missing
numbers. That is, no element of nums is included in any of the ranges, and each
missing number is covered by one of the ranges.

Example 1:
Input: nums = [0,1,3,50,75], lower = 0, upper = 99
Output: [[2,2],[4,49],[51,74],[76,99]]

Explanation: The ranges are:
[2,2]
[4,49]
[51,74]
[76,99] */

import java.util.ArrayList;
import java.util.List;

public class Question7 {// MissingRanges
          public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
                    List<String> ranges = new ArrayList<>();
                    int next = lower;

                    for (int num : nums) {
                              if (num > next) {
                                        ranges.add(formatRange(next, num - 1));
                              }
                              next = num + 1;
                    }

                    if (next <= upper) {
                              ranges.add(formatRange(next, upper));
                    }

                    return ranges;
          }

          private static String formatRange(int start, int end) {
                    if (start == end) {
                              return String.valueOf(start);
                    } else {
                              return start + "->" + end;
                    }
          }

          public static void main(String[] args) {
                    int[] nums = { 0, 1, 3, 50, 75 };
                    int lower = 0;
                    int upper = 99;
                    List<String> missingRanges = findMissingRanges(nums, lower, upper);
                    System.out.println(missingRanges);
          }
}
