package Exercise21;

import java.util.*;

public class Main {
    private static int getValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Triangle, Double> triangleAreaMap = new LinkedHashMap<>();

        int n = getValidInt(scanner, "Input n:");

        for (int i = 0; i < n; i++) {
            int a = getValidInt(scanner, "Input a:");
            int b = getValidInt(scanner, "Input b:");
            int c = getValidInt(scanner, "Input c:");

            int[] sides = {a, b, c};
            Triangle triangle = new Triangle(sides);

            double area = triangle.area();
            triangleAreaMap.put(triangle, area);
        }

        System.out.println("\nTriangles dimensions: ");
        for (Triangle triangle : triangleAreaMap.keySet()) {
            triangle.printArrayOfSides();
        }

        final Triangle[] maxAreaTriangle = {null};
        final double[] maxArea = {Double.MIN_VALUE};

        triangleAreaMap.forEach((triangle, area) -> {
            if (area > maxArea[0]) {
                maxArea[0] = area;
                maxAreaTriangle[0] = triangle;
            }
        });

        if (maxAreaTriangle[0] != null) {
            System.out.printf("\nMax area: %.2f\n", maxArea[0]);
            maxAreaTriangle[0].printArrayOfSides();
        } else {
            System.out.println("\nNo triangles available.");
        }

        ArrayList<Triangle> triangleList = new ArrayList<>(triangleAreaMap.keySet());

        boolean validIndexRemoved = false;

        while (!validIndexRemoved) {
            int indexToRemove = getValidInt(scanner, "\nInput index of the triangle to remove:");

            if (indexToRemove >= 0 && indexToRemove < triangleList.size()) {
                Triangle triangleToRemove = triangleList.get(indexToRemove);
                int[] sidesToRemove = triangleToRemove.getArrayOfSides();

                System.out.print("\nRemoving triangle with dimensions: ");
                for (int side : sidesToRemove) {
                    System.out.print(side + " ");
                }

                triangleList.remove(indexToRemove);
                triangleAreaMap.remove(triangleToRemove);

                validIndexRemoved = true;
            } else {
                System.out.println("\nInvalid index. Please try again.");
            }
        }

        System.out.println("\n\nRemaining triangles:");
        for (Triangle triangle : triangleList) {
            triangle.printArrayOfSides();
        }

        triangleList.sort(Comparator.comparingDouble(triangleAreaMap::get));

        System.out.printf("\n%-25s%-15s\n", "Triangle Dimensions", "Area");
        for (Triangle triangle : triangleList) {
            int[] sides = triangle.getArrayOfSides();
            String sidesStr = String.format("Sides: %d %d %d", sides[0], sides[1], sides[2]);
            System.out.printf("%-25s%-15.2f\n", sidesStr, triangleAreaMap.get(triangle));
        }

        scanner.close();
    }
}