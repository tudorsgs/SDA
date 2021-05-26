package Laborator_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> noteLbRom = new ArrayList<>();
        noteLbRom.add(9.20);
        noteLbRom.add(4.20);
        noteLbRom.add(9.9);

        ArrayList<Double> noteMate = new ArrayList<>();
        noteMate.add(5.5);
        noteMate.add(6.5);
        noteMate.add(9.5);


        ArrayList<Double> noteLbRom1 = new ArrayList<>();
        noteLbRom1.add(4.4);
        noteLbRom1.add(4.20);
        noteLbRom1.add(6.9);

        ArrayList<Double> noteMate1 = new ArrayList<>();
        noteMate1.add(8.5);
        noteMate1.add(9.5);
        noteMate1.add(9.5);

        ArrayList<Double> noteLbRom2 = new ArrayList<>();
        noteLbRom2.add(2.4);
        noteLbRom2.add(2.20);
        noteLbRom2.add(1.9);

        ArrayList<Double> noteMate2 = new ArrayList<>();
        noteMate2.add(3.5);
        noteMate2.add(7.5);
        noteMate2.add(8.5);

        ArrayList<Double> noteLbRom3 = new ArrayList<>();
        noteLbRom3.add(8.4);
        noteLbRom3.add(8.20);
        noteLbRom3.add(8.9);

        ArrayList<Double> noteMate3 = new ArrayList<>();
        noteMate3.add(7.5);
        noteMate3.add(9.4);
        noteMate3.add(9.2);

        ArrayList<Double> noteLbRom4 = new ArrayList<>();
        noteLbRom4.add(2.4);
        noteLbRom4.add(3.20);
        noteLbRom4.add(9.9);

        ArrayList<Double> noteMate4 = new ArrayList<>();
        noteMate4.add(4.5);
        noteMate4.add(9.5);
        noteMate4.add(9.5);

        ArrayList<Double> noteLbRom5 = new ArrayList<>();
        noteLbRom5.add(9.4);
        noteLbRom5.add(9.20);
        noteLbRom5.add(9.9);

        ArrayList<Double> noteMate5 = new ArrayList<>();
        noteMate5.add(8.5);
        noteMate5.add(8.5);
        noteMate5.add(8.5);

        ArrayList<Double> noteLbRom6 = new ArrayList<>();
        noteLbRom6.add(2.4);
        noteLbRom6.add(2.20);
        noteLbRom6.add(3.9);

        ArrayList<Double> noteMate6 = new ArrayList<>();
        noteMate6.add(4.5);
        noteMate6.add(4.5);
        noteMate6.add(4.5);

        ArrayList<Double> noteLbRom7 = new ArrayList<>();
        noteLbRom7.add(6.4);
        noteLbRom7.add(6.20);
        noteLbRom7.add(6.9);

        ArrayList<Double> noteMate7 = new ArrayList<>();
        noteMate7.add(7.7);
        noteMate7.add(7.7);
        noteMate7.add(6.6);

        ArrayList<Double> noteLbRom8 = new ArrayList<>();
        noteLbRom8.add(5.4);
        noteLbRom8.add(5.60);
        noteLbRom8.add(6.0);

        ArrayList<Double> noteMate8 = new ArrayList<>();
        noteMate8.add(9.5);
        noteMate8.add(9.5);
        noteMate8.add(9.5);

        ArrayList<Double> noteLbRom9 = new ArrayList<>();
        noteLbRom9.add(4.4);
        noteLbRom9.add(4.20);
        noteLbRom9.add(10.0);

        ArrayList<Double> noteMate9 = new ArrayList<>();
        noteMate9.add(5.5);
        noteMate9.add(6.5);
        noteMate9.add(9.5);


        StudentDetails student1 = new StudentDetails("Popescu", "Margareta", noteLbRom, noteMate);
        StudentDetails student2 = new StudentDetails("Pripeag", "Mircea", noteLbRom1, noteMate1);
        StudentDetails student3 = new StudentDetails("Bahoi", "Daniel", noteLbRom2, noteMate2);
        StudentDetails student4 = new StudentDetails("Rebenciuc", "Mihai", noteLbRom3, noteMate3);
        StudentDetails student5 = new StudentDetails("Tatar", "Florin", noteLbRom4, noteMate4);
        StudentDetails student6 = new StudentDetails("Zamfira", "Monica", noteLbRom5, noteMate5);
        StudentDetails student7 = new StudentDetails("Mileu", "Misu", noteLbRom6, noteMate6);
        StudentDetails student8 = new StudentDetails("Perplexu", "mihailescu", noteLbRom7, noteMate7);
        StudentDetails student9 = new StudentDetails("Derivat", "Paralel", noteLbRom8, noteMate8);
        StudentDetails student10 = new StudentDetails("Integrat", "Perpendicular", noteLbRom9, noteMate9);


        Map<String, StudentDetails> students = new HashMap<>();
        students.put("1234567891011", student1);
        students.put("9876543211012", student2);
        students.put("6555263655663", student3);
        students.put("6523225411253", student4);
        students.put("4466552255223", student5);
        students.put("0129489716523", student6);
        students.put("3216549871473", student7);
        students.put("9638552741983", student8);
        students.put("7965547897983", student9);
        students.put("3165498700002", student10);


        Scanner scan = new Scanner(System.in);
        System.out.println("Insert CNP");
        String CNP = scan.nextLine();

        StudentDetails st1 = students.get(CNP);
        System.out.println(st1);
        System.out.println();

        for (String key : students.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        Map<String, StudentDetails> studentsLink = new LinkedHashMap<>();
        studentsLink.put("1234567891011", student1);
        studentsLink.put("9876543211012", student2);
        studentsLink.put("6555263655663", student3);
        studentsLink.put("6523225411253", student4);
        studentsLink.put("4466552255223", student5);
        studentsLink.put("0129489716523", student6);
        studentsLink.put("1231254213654", student7);
        studentsLink.put("9638552741983", student8);
        studentsLink.put("7965547897983", student9);
        studentsLink.put("3165498700002", student10);

        for (Map.Entry<String, StudentDetails> entry : studentsLink.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println();
        for (String key : studentsLink.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        StudentDetails student11 = new StudentDetails("Mircea", "Lobota", noteLbRom, noteMate);

        System.out.println(studentsLink.get("1234567891011"));

        studentsLink.put("1234567891011", student11);
        System.out.println(studentsLink.get("1234567891011"));


    }
}
