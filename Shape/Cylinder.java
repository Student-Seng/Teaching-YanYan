package Shape;

import java.util.Scanner;

public class Cylinder extends Shape3D {
    private double radius, height;
    public Cylinder (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calcSurfaceArea() {
        return (2*Math.PI*radius*radius + Math.PI*(2*radius)*height);
    }

    public static Cylinder constructUI() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter radius of cylinderr");
        double radius = userInput.nextInt();
        System.out.println("Enter height of cylinder");
        double height = userInput.nextInt();
        return new Cylinder(radius, height);
    }
    

}
