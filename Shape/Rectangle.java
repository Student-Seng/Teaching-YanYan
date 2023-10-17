package Shape;

import java.util.Scanner;

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

    public static Rectangle constructUI() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double length = userInput.nextInt();
        System.out.println("Enter breadth of rectangle");
        double breadth = userInput.nextInt();
        return new Rectangle(length, breadth);
    }
}
