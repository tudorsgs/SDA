package Laborator_2.Problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Unde doriti sa aflati limita?");
        String comanda = word.nextLine();
        System.out.println("At ales: " + comanda);
        if (comanda.equals("Oras")) {
            System.out.println("Viteza maxima pentru oras este 50 km/h" );
        }
        else {
            if (comanda.equals("Zona Rezidentiala")) {
                System.out.println("Viteza maxima pentru Zona Rezidentiala este 30 km/h" );
            }
            else {
                if (comanda.equals("Drum express")) {
                    System.out.println("Viteza maxima pentru Drum express este 100 km/h" );
                }
                else {
                    if (comanda.equals("Autostrada")) {
                        System.out.println("Viteza maxima pentru Autostrada este 130 km/h" );
                    }
                    else  {
                        System.out.println("Zona invalida");
                    }
                }
            }
        }

    }
}