package Laborator_4.Problema4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        try {
            shapes.add(new Rectangle("#010321", 1, 4, 8));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Rectangle("#010101", 1, 4, 8));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Circle("#022010", 1, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Square("#010101", 1, 3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        HashMap<String, Integer> my_dict = new HashMap<>();
        int p = 0;
        for (Shape s : shapes) {
            my_dict.put(s.getHexFillColor(), p);
        }

        System.out.println(my_dict);

        for (Shape s : shapes) {
            my_dict.put(s.getHexFillColor(), my_dict.get(s.getHexFillColor()) + 1);
        }

        System.out.println(my_dict);
    }
}