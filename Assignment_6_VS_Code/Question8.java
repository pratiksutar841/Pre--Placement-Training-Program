package Assignment_6_VS_Code;
/*  <aside>
💡 **Question 8**

Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2.
 You may assume that multiplication is always possible.

**Example 1:**
*Input:** mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]

**Output:**

[[7,0,0],[-7,0,3]]

</aside> */

import java.util.Arrays;

public class  Question8 {  //SparseMatrixMultiplication {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int p = 0; p < k; p++) {
                    result[i][j] += mat1[i][p] * mat2[p][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Question8  solution = new Question8 ();

        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};

        int[][] result = solution.multiply(mat1, mat2);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
