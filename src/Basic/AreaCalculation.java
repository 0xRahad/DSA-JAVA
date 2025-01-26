package Basic;

import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        triangleArea(sc);
        circleArea(sc);
    }

    //triangle area
    public static void triangleArea(Scanner sc) {
        double base, height, area;
        System.out.print("Enter base: ");
        base = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        area = 0.5 * (base * height);
        System.out.println("Area of triangle : " + area);
    }

    //circle area
    public static void circleArea(Scanner sc) {
        double radius, area;
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        area = 3.1416 * (radius * radius);
        System.out.println("Area of circle: " + area);
    }
}
