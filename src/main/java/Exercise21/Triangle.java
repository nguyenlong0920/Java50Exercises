package Exercise21;

public class Triangle extends Shape {

    public Triangle(int[] arrayOfSides) {
        super(3, arrayOfSides);
    }

    public boolean isValidTriangle() {
        int[] side = getArrayOfSides();
        return side[0] + side[1] > side[2] &&
                side[0] + side[2] > side[1] &&
                side[1] + side[2] > side[0];
    }

    @Override
    public void printArrayOfSides() {
        System.out.print(!isValidTriangle() ? "This isn't a triangle: " : "Sides of the triangle: ");
        for (int s : getArrayOfSides()) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public double area() {
        int[] side = getArrayOfSides();
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p - side[0]) * (p - side[1]) * (p - side[2]));
    }
}