package Shape;

public class Polyhedron extends Shape3D {
    protected Shape2D[] surfaceShapes;

    public Polyhedron(Shape2D[] surfaceShapes) {
        this.surfaceShapes = surfaceShapes;
    }

    public Polyhedron() {};

    @Override
    public double calcSurfaceArea() {
        double surfaceArea = 0;
        for (Shape2D shape : surfaceShapes)
            surfaceArea += shape.calcArea();
        return surfaceArea;
    }
}
