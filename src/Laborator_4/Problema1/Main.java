package Laborator_4.Problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vec[] = new int[10];
        int n = vec.length;
        System.out.println("Value for your unidimensional are: ");
        for (int i=0; i<n; i++) {
            Scanner scan2 = new Scanner(System.in);
            int val=scan2.nextInt();
            vec[i]=val;
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(vec[i]);
            } else {
                System.out.print(vec[i] + ",");
            }
        }

        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("What number do u like to add?");
        int x = scan.nextInt();
        System.out.println("And at witch position?");
        Scanner word = new Scanner(System.in);
        String pos = word.nextLine();
        int m= 2*n;
        int v[] = new int [m];
        switch (pos) {
            case "begin":
                v[0]= x;
                for (int i = 1; i<=n; i++) {
                    v[i] = vec[i - 1];
                }
                for (int i = 0; i <= n; i++) {
                    if (i==n) {
                        System.out.print(v[i]);
                    }
                    else {
                        System.out.print(v[i] + ",");
                    }
                }
                break;
            case "mid":
                System.out.println("More precise?");
                int poz = scan.nextInt();
                for (int i = 0; i < poz; i++) {
                    v[i] = vec[i];
                }
                v[poz]=x;
                for (int i = poz+1; i <=n; i++) {
                    v[i] = vec[i-1];
                }
                for (int i = 0; i <= n; i++) {
                    if (i==n) {
                        System.out.print(v[i]);
                    }
                    else {
                        System.out.print(v[i] + ",");
                    }
                }
                break;
            case "end":
                v[n] = x;
                for (int i = 0; i<n; i++) {
                    v[i] = vec[i];
                }

                for (int i = 0; i <= n; i++) {
                    if (i==n) {
                        System.out.print(v[i]);
                    }
                    else {
                        System.out.print(v[i] + ",");
                    }
                }
                break;
            default:
                System.out.println("Out of area");
                break;
        }

    }
}
