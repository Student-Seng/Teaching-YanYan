package Shape;
import java.util.Scanner;

public class Circle extends Shape2D {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public static Circle constructUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double radius = scanner.nextInt();
        return new Circle(radius);
    }
}
