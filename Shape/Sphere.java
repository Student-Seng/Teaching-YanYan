package Shape;

import java.util.Scanner;

public class Sphere extends Shape3D {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public static Sphere constructUI() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter radius of sphere");
        double radius = userInput.nextInt();
        return new Sphere(radius);
    }
}
