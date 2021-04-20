package Laborator_3;

public class Square implements Shape {

    private String fillColor;
    private int borderWidth;
    private int size;
    private HexColorValidator hcv;
    private static final String SQUARE = "Square";

    public Square(String fillColor, int borderWidth, int size) throws Exception {
        this.hcv = new HexColorValidator();
        if (hcv.validate(fillColor)) {
            this.fillColor = fillColor;
        }

        if (borderWidth > 0) {
            this.borderWidth = borderWidth;
        } else throw new Exception(SQUARE + " Invalid Border Width");

        if (size > 0) {
            this.size = size;
        } else throw new Exception(SQUARE + " Invalid Size");
    }


    @Override
    public void draw() {
        int i, j;
        for (i = 1; i <= size; i++) {
            for (j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Override
    public double getArea() {

        return size * size;
    }

    @Override
    public String getName() {
        return SQUARE;
    }

    @Override
    public String getHexFillColor() {
        return fillColor;
    }

    @Override
    public int getBorderWidth() {
        return borderWidth;
    }
}
