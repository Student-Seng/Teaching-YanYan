package Shape;

public class SquarePyramid extends Polyhedron {
    private double height;
    private double base;
    private Shape2D[] surfaceShapes;

    public SquarePyramid(double height, double base) {
        this.height = height;
        this.base = base;

        this.surfaceShapes = new Shape2D[5];
        surfaceShapes[0] = new Rectangle(base, base);

        double hypothenus = Math.sqrt(Math.pow(height, 2) + Math.pow(base/2, 2));
        for (int i=1; i<5; i++) {
            surfaceShapes[i] = new Triangle(hypothenus, base);
        }
    }
}