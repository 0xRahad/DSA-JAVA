package Basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a positive integer.");
            sc.close();
            return;
        }

        int num = sc.nextInt();

        if (num < 2) {
            System.out.println("Not a prime number (Prime numbers are greater than 1)");
            sc.close();
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is Not a prime number");
        }

        sc.close();
    }
}
