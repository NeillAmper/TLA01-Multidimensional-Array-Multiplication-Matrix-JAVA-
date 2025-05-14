package com.mycompany.amper_matrix;

public class Amper_Matrix {

    public static void main(String[] args) {
        int[][] matrix = new int[13][13];

        for (int i = 1; i <= 12; i++) {
            for (int e = 1; e <= 12; e++) {
                matrix[i][e] = i * e;
            }
        }

        System.out.print("    ");
        for (int i = 1; i <= 12; i++) {
            if (i < 10) {
                System.out.print("   " + i);
            } else {
                System.out.print("  " + i);
            }
        }
        System.out.println();

        for (int o = 1; o <= 12; o++) {
            if (o < 10) {
                System.out.print("   " + o);
            } else {
                System.out.print("  " + o);
            }

            for (int a = 1; a <= 12; a++) {
                int value = matrix[o][a];
                if (value < 10) {
                    System.out.print("   " + value);
                } else if (value < 100) {
                    System.out.print("  " + value);
                } else {
                    System.out.print(" " + value);
                }
            }
            System.out.println();
        }
    }
}
