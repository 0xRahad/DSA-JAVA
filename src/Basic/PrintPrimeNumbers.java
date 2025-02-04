package Basic;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial number: ");
        int m = sc.nextInt();

        System.out.print("Enter ending number: ");
        int n = sc.nextInt();

        if (m < 2) m = 2;

        System.out.println("Prime numbers between " + m + " and " + n + ":");

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int j = 3; j * j <= num; j += 2) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
