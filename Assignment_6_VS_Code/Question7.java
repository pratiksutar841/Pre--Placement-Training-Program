package Assignment_6_VS_Code;
/*  <aside>
💡 **Question 7**

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

**Example 1:**

*Input:** n = 3

**Output:** [[1,2,3],[8,9,4],[7,6,5]]

</aside> */

import java.util.*;

public class Question7 {  //SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // Start filling the matrix with the number 1

        int top = 0; // Top boundary
        int bottom = n - 1; // Bottom boundary
        int left = 0; // Left boundary
        int right = n - 1; // Right boundary

        while (num <= n * n) {
            // Fill the top row from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; // Shrink the top boundary

            // Fill the right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // Shrink the right boundary

            // Fill the bottom row from right to left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--; // Shrink the bottom boundary

            // Fill the left column from bottom to top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++; // Shrink the left boundary
        }

        return matrix;
    }

    public static void main(String[] args) {
        Question7  solution = new Question7 ();
        int n = 3;
        int[][] matrix = solution.generateMatrix(n);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
