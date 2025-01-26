package Basic;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                celsiusToFahrenheit(sc);
                break;
            case 2:
                fahrenheitToCelsius(sc);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }

    public static void celsiusToFahrenheit(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void fahrenheitToCelsius(Scanner sc) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
