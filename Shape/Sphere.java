package Shape;

public class Sphere extends Shape3D {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
