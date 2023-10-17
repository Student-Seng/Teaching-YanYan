import Shape.*;
import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of shapes");
        int numShapes = scanner.nextInt();
        Shape3D[] shapes = new Shape3D[numShapes];
        for(int i=0; i<numShapes;i++) {
            System.out.println("Enter number to the corresponding shape (1)Sphere, (2)Square-based Pyramid, (3)Cuboid, (4)Cone, (5)Cylinder");
            int shapeChoice = scanner.nextInt();
            if(shapeChoice==1) {
                shapes[i] = Sphere.constructUI();
            }
            else if(shapeChoice==2) {
                shapes[i] = SquarePyramid.constructUI();
            }
            else if(shapeChoice==3) {
                shapes[i] = Cuboid.constructUI();
            }
            else if(shapeChoice==4) {
                shapes[i] = Cone.constructUI();
            }
            else if(shapeChoice==5) {
                shapes[i] = Cylinder.constructUI();
            }
            else{
                System.out.println("Wrong input try again.");
                i--;
            }
        }

        double totalArea = 0;
        for (Shape3D shape : shapes) {
            totalArea += shape.calcSurfaceArea();
        }
        System.out.println("Total Area: " + totalArea);
    }
}
