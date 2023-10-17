package Shape;

import java.util.Scanner;

public class Cuboid extends Polyhedron {
    private double length;
    private double breadth;
    private double height;
    
    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;

        surfaceShapes = new Shape2D[6];
        // Base
        for (int i=0; i<2; i++)
            surfaceShapes[i] = new Rectangle(length, breadth);

        // Height x Breadth Surface
        for (int i=2; i<4; i++)
            surfaceShapes[i] = new Rectangle(height, breadth);
        
        // Height x Length Surface
        for (int i=4; i<6; i++)
            surfaceShapes[i] = new Rectangle(height, length);
    }

    public Cuboid(double height, double base) {
        this(base, base, height);
    }

    public static Cuboid constructUI() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter height of cuboid");
        double height = userInput.nextInt();
        System.out.println("Enter base of cuboid");
        double base = userInput.nextInt();
        return new Cuboid(height, base);
    }
    
}