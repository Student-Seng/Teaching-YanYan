package Shape;

public class Cuboid extends Polyhedron {
    private double length;
    private double breadth;
    private double height;
    
    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;

        this.surfaceShapes = new Shape2D[6];
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
}