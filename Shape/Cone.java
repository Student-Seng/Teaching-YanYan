package Shape;
import java.util.Scanner;

public class Cone extends Shape3D {
    private double radius, height;
    public Cone (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calcSurfaceArea() {
        return (Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius)));
    }

    public static Cone constructUI() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter radius of cone");
        double radius = userInput.nextInt();
        System.out.println("Enter height of cone");
        double height = userInput.nextInt();
        return new Cone(radius, height);
    }
}
