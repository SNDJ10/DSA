package com.xworkz.dsa.internal;

public class TransposeOfMatrix {

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // cols

        int[][] result = new int[n][m]; // n rows, m cols

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j]; // swap
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // ✅ Define matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // ✅ Call method
        int[][] result = transpose(matrix);

        // ✅ Print result
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}