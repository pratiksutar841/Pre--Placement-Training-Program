package Assignment_3_VS_Code;
/*  Question 8
Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false */

import java.util.Arrays;

public class Question8 {// MeetingRooms
          public static boolean canAttendMeetings(int[][] intervals) {
                    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

                    for (int i = 1; i < intervals.length; i++) {
                              if (intervals[i][0] < intervals[i - 1][1]) {
                                        return false;
                              }
                    }

                    return true;
          }

          public static void main(String[] args) {
                    int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
                    boolean canAttend = canAttendMeetings(intervals);
                    System.out.println(canAttend);
          }
}
