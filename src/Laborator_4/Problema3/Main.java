package Laborator_4.Problema3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vec[] = new int[10];
        int n = vec.length;
        vec[0] = 10;
        vec[1] = 11;
        vec[2] = 12;
        vec[3] = 13;
        vec[4] = 47;
        vec[5] = 74;
        vec[6] = 96;
        vec[7] = 144;
        vec[8] = 311;
        vec[9] = 902;

        Scanner scan = new Scanner(System.in);
        System.out.println("What number u like to find it?");
        int x = scan.nextInt();

        boolean sem = false;

        int k = 0;
        while (k == 0) {
            if (vec[0] > x) {
                sem = false;
                k=1;
                System.out.print("Your number is to small in comparison with our list. So the sign is: ");
                break;
            }
            if (vec[0] == x) {
                sem = true;
                System.out.print("Your number is the first one of the list. So the sign is: ");
                break;
            }

            if (vec[n - 1] < x) {
                sem = false;
                k=1;
                System.out.print("Your number is to big in comparison with our list. So the sign is: ");
                break;
            }
            if (vec[n - 1] == x) {
                sem = true;
                System.out.print("Your number is the last one of the list. So the sign is: ");
                break;
            }

            if (vec[n / 2 - 1] == x) {
                sem = true;
                System.out.print("Your number is in the middle of the list. So the sign is: ");
                break;
            }

            if (vec[n / 2] > x) {
                for (int i = 0; i < n / 2; i++) {
                    if (vec[i] == x) {
                        sem = true;
                        System.out.print("Your number is lower then the mid one. So the sign is: ");
                        break;
                    }
                }
            }
            if (vec[n / 2] < x) {
                for (int i = n / 2; i < n; i++) {
                    if (vec[i] == x) {
                        sem = true;
                        System.out.print("Your number is bigger then the mid one. So the sign is: ");
                        break;
                    }
                }
            }
            k=2;
        }

        if (sem) {
            System.out.print(sem);
        } else
            if (k==2){
            System.out.println("Number not found. So the sign is: " + sem);
        } else {
                System.out.print(sem);
            }

    }
}