package Laborator_5;

import java.util.ArrayList;

public class StudentDetails {
    private String nume;
    private String prenume;
    //  public Double nota1;
    //   public Double nota2;
    private ArrayList<Double> noteLibRomana;
    private ArrayList<Double> noteMatematica;

    public StudentDetails(String nume, String prenume, ArrayList<Double> noteLibRomana, ArrayList<Double> noteMatematica) {
        this.nume = nume;
        this.prenume = prenume;
        this.noteLibRomana = noteLibRomana;
        this.noteMatematica = noteMatematica;

    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", noteLibRomana=" + noteLibRomana +
                ", noteMatematica=" + noteMatematica +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public String getPrenum() {
        return prenume;
    }

    public ArrayList<Double> getNoteLibRomana() {
        return noteLibRomana;
    }

    public ArrayList<Double> getNoteMatematica() {
        return noteMatematica;
    }


}
