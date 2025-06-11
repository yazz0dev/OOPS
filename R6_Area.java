//WRITE A PROGRAM TO FIND AREA OF DIFFERENT SHAPES USING OVERLOADED FUNCTION 

import java.util.Scanner;     

class Area
{
    void area(double radius)
    {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void area(double length, double width)
    {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void area(double base, double height, int Triangle) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("1.Circle \n2.Rectangle \n3.Triangle\nchoice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Radius: ");
                a.area(sc.nextDouble());
                break;
            case 2:
                System.out.print("Length & Width: ");
                a.area(sc.nextDouble(), sc.nextDouble());
                break;
            case 3:
                System.out.print("Base & Height: ");
                a.area(sc.nextDouble(), sc.nextDouble(), 1);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
