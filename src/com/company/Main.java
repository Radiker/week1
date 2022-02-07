package com.company;

import java.util.Arrays;

public class Main {
    public static double[][] matrixMultiply(double[][] matrix1, double[][] matrix2) {
        // WRITE CODE HERE
        //Результатом умножения матриц A(m * n) и B(n * k) будет матрица C(m * k)
        //Вычисление разрядности матриц
        int m = matrix1.length;
        int n = matrix1[0].length;
        int k = matrix2[0].length;
        //объявляем результативную матрицу
        double[][] matrix = new double[m][k];
        //Проходимся по элементам матрицы
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                //Обнуляем значение
                matrix[i][j] = 0;
                //Суммируем произведения элементов i-строки 1 матрицы
                //на соответствующие элементы j-того столбца 2 матрицы
                for (int l = 0; l < n; l++) {
                    matrix[i][j] += matrix1[l][i] * matrix2[j][l];
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