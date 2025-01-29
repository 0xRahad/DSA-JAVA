package Basic;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, result = 0;

        System.out.print("Enter starting number: ");
        m = sc.nextInt();
        System.out.print("Enter ending number: ");
        n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }

        System.out.println("The sum of odd numbers from " + m + " to " + n + " is: " + result);
        sc.close();
    }
}
