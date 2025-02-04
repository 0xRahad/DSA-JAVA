package Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0, second = 1, fibo, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers: ");
        n = sc.nextInt();

        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++) {
            fibo = first + second;
            System.out.print(" "+ fibo);
            first = second;
            second = fibo;
        }

    }
}
