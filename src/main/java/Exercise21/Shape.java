package Exercise21;

public class Shape {
    private int numberOfSides;
    private int[] arrayOfSides;

    public Shape(int numberOfSide, int[] arrayOfSides) {
        this.numberOfSides = numberOfSide;
        this.arrayOfSides = arrayOfSides;
    }

    public int getNumberOfSide() {
        return numberOfSides;
    }

    public void setNumberOfSide(int numberOfSide) {
        this.numberOfSides = numberOfSide;
    }

    public int[] getArrayOfSides() {
        return arrayOfSides;
    }

    public void setArrayOfSides(int[] arrayOfSides) {
        this.arrayOfSides = arrayOfSides;
    }

    public int perimeter () {
        int perimeter = 0;
        for (int arrayOfSide : arrayOfSides) {
            perimeter += arrayOfSide;
        }
        return perimeter;
    }

    public void printArrayOfSides() {
        System.out.print("Array of Sides: ");
        for (int arrayOfSide : arrayOfSides) {
            System.out.print(arrayOfSide + " ");
        }
        System.out.println();
    }
}