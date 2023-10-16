import Shape.*;

public class Shape2DApp {
    public static void main(String[] args) {
        Shape2D[] shapes = new Shape2D[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Triangle(25, 20);
        shapes[2] = new Rectangle(50, 20);

        double totalArea = 0;
        for (Shape2D shape : shapes) {
            totalArea += shape.calcArea();
        }
        System.out.println("Total Area: " + totalArea);
    }
}