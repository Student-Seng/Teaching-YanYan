package Shape;

import java.util.Scanner;

public class SquarePyramid extends Polyhedron {
    private double height;
    private double base;

    public SquarePyramid(double height, double base) {
        this.height = height;
        this.base = base;

        surfaceShapes = new Shape2D[5];
        surfaceShapes[0] = new Rectangle(base, base);

        double hypothenus = Math.sqrt(Math.pow(height, 2) + Math.pow(base/2, 2));
        for (int i=1; i<5; i++) {
            surfaceShapes[i] = new Triangle(hypothenus, base);
        }
    }

    public static SquarePyramid constructUI() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter height of Square Pyramid");
        double height = userInput.nextInt();
        System.out.println("Enter base of Square Pyramid");
        double base = userInput.nextInt();
        return new SquarePyramid(height, base);
    }
}