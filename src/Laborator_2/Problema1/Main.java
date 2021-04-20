package Laborator_2.Problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Unde doriti sa aflati limita?");
        String comanda = word.nextLine();
        System.out.println("At ales: " + comanda);
        System.out.println("Prima metoda este cea cu if{} else{ if{...}");
        if (comanda.equals("Oras")) {
            System.out.println("Viteza maxima pentru oras este 50 km/h");
        } else {
            if (comanda.equals("Zona Rezidentiala")) {
                System.out.println("Viteza maxima pentru Zona Rezidentiala este 30 km/h");
            } else {
                if (comanda.equals("Drum express")) {
                    System.out.println("Viteza maxima pentru Drum express este 100 km/h");
                } else {
                    if (comanda.equals("Autostrada")) {
                        System.out.println("Viteza maxima pentru Autostrada este 130 km/h");
                    } else {
                        System.out.println("Zona invalida");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Executam din nou pentru metoda if{else if{ else if{..}");

        if (comanda.equals("Oras")) {
            System.out.println("Viteza maxima pentru oras este 50 km/h");
        } else if (comanda.equals("Zona Rezidentiala")) {
            System.out.println("Viteza maxima pentru Zona Rezidentiala este 30 km/h");
        } else if (comanda.equals("Drum express")) {
            System.out.println("Viteza maxima pentru Drum express este 100 km/h");
        } else if (comanda.equals("Autostrada")) {
            System.out.println("Viteza maxima pentru Autostrada este 130 km/h");
        } else {
            System.out.println("Zona invalida");
        }
        System.out.println();
        System.out.println("Ultima metoda este cea cu case: switch..case...break..case...");

        switch (comanda) {
            case "Oras":
                System.out.println("Viteza maxima pentru oras este 50 km/h");
                break;
            case "Zona rezidentiala":
                System.out.println("Viteza maxima pentru Zona Rezidentiala este 30 km/h");
                break;
            case "Drum express":
                System.out.println("Viteza maxima pentru Drum express este 100 km/h");
                break;
            case "Autostrada":
                System.out.println("Viteza maxima pentru Autostrada este 130 km/h");
                break;
            default:
                System.out.println("Zona invalida");
                break;
        }

    }
}


