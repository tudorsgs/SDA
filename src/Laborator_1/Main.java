package Laborator_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int x= scan.nextInt();
        int y= scan.nextInt();
        Operatii op = new Operatii();
        System.out.println("Suma numerelor este: " + op.adunare(x,y));
        System.out.println("Diferenta numerelor este: " + op.scadere(x,y));
        System.out.println("Produsul numerelor este: " + op.inmultire(x,y));
        System.out.printf("Media numerelor este: " + "%.2f\n", op.media(x,y));
        System.out.println("Modulul/distanta acestor numere este: " + op.distana(x,y));
        System.out.println("Maximul dintre aceste doua numere este: " + op.maxim(x,y));
        System.out.println("Minimul dintre aceste doua numere este: " + op.minim(x,y));
}
}
