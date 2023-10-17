import Shape.*;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter total number of shapes");
        int numShapes = userInput.nextInt();
        Shape2D[] shapes = new Shape2D[numShapes];
        for(int i=0; i<numShapes;i++) {
            System.out.println("Enter number to the corresponding shape (1)Circle, (2)Triangle, (3)Rectangle");
            int shapeChoice = userInput.nextInt();
            if (shapeChoice == 1) {
                shapes[i] = Circle.constructUI();
            }
            else if (shapeChoice == 2) {
                shapes[i] = Triangle.constructUI();
            }
            else if (shapeChoice == 3) {
                shapes[i] = Rectangle.constructUI();
            }
            else {
                System.out.println("Wrong input try again.");
                i--;
            }
        }

        double totalArea = 0;
        for (Shape2D shape : shapes) {
            totalArea += shape.calcArea();
        }
        System.out.println("Total Area: " + totalArea);
    }
}