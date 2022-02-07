package com.company;

import java.util.Arrays;

public class Main {
    public static double[][] matrixMultiply(double[][] matrix1, double[][] matrix2) {
        // WRITE CODE HERE
        int length = Math.max(matrix1[0].length, matrix1.length);
        int height = Math.min(matrix1[0].length, matrix1.length);
        double[][] matrix = new double[length][length];
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = 0;
                for (int l = 0; l < height; l++) {
                    if(matrix1[0].length > matrix1.length)
                        matrix[i][j] += matrix1[l][i] * matrix2[j][l];
                    else
                        matrix[i][j] += matrix1[i][l] * matrix2[l][j];
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};
        System.out.println(Arrays.deepToString(matrixMultiply(matrix1, matrix2)));
    }
}