package Shape;

import java.util.Scanner;

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
    
    public static Triangle constructUI() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter height of rectangle");
        double height = userInput.nextInt();
        System.out.println("Enter base of rectangle");
        double base = userInput.nextInt();
        return new Triangle(height, base);
    }
}
