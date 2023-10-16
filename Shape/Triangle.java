package Shape;

public class Triangle extends Shape2D {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }
}
