//WRITE A PROGRAM TO FIND AREA OF DIFFERENT SHAPES USING OVERLOADED FUNCTION (very basic)

import java.util.Scanner;     

class Area
{
    // Method to calculate area of circle
    double area(double radius)
    {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate area of rectangle
    double area(double length, double width)
    {
        return length * width;
    }
    
    // Method to calculate area of triangle
    // Renamed to avoid conflict with rectangle area method
    double areaTriangle(double base, double height) 
    {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Area areaCalculator = new Area();
        
        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of Circle: " + areaCalculator.area(radius));
                break;
                
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of Rectangle: " + areaCalculator.area(length, width));
                break;
                
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble(); // Declare and read base
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                // Call the renamed method for triangle area
                System.out.println("Area of Triangle: " + areaCalculator.areaTriangle(base, height)); 
                break;
                
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
// The program calculates the area of different shapes (circle, rectangle, triangle) using method overloading.
// The user is prompted to choose a shape and enter the necessary dimensions.
