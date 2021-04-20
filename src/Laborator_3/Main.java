package Laborator_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        try {
            shapes.add(new Rectangle("#12FFFF", 1, 4, 8));

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        try {

            shapes.add(new Circle("#123456", 1, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Square("#ABCDEF", 1, 3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Shape s : shapes) {

            System.out.println(s.getName() + " " + s.getArea() + "cm^2 " + s.getBorderWidth() + " " + s.getHexFillColor());
            s.draw();
        }


    }
}