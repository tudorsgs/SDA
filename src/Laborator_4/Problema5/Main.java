package Laborator_4.Problema5;

import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("select your matrix dimension");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int matrix[][] = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = random.nextInt(256);
                matrix[i][j] = val;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int nn = n / 3 * 3;
        int mm = m / 3 * 3;
        int matrixFilter[][] = new int[nn][mm];
        int dim = 3;

        for (int i = 0; i < nn; i = i + dim) {
            for (int j = 0; j < mm; j = j + dim) {
                int medie = 0;
                for (int ii = 0; ii < dim; ii++) {
                    for (int jj = 0; jj < dim; jj++) {
                        medie += matrix[i + ii][j + jj];
                    }
                }
                medie = medie / 9;

                for (int ii = 0; ii < dim; ii++) {
                    for (int jj = 0; jj < dim; jj++) {
                        matrixFilter[i + ii][j + jj] = medie;
                    }
                }

            }
        }

        System.out.println();

        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                System.out.print(matrixFilter[i][j] + " ");
            }
            System.out.println();
        }
    }
}