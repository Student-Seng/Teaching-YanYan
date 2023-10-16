package Shape;

public class Rectangle extends Shape2D {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calcArea() {
        return length * breadth;
    }
}
