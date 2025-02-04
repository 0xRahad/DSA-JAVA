package Basic;

import java.util.Scanner;

public class FibonacciTwo {
    public static void main(String[] args) {
        int n, first = 0, second = 1, fibo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Which fibonacci number do you want? : ");
        n = sc.nextInt();
        for (int i = 3; i<=n;i++){
            fibo = first+second;
            first = second;
            second = fibo;
        }
        System.out.print("Your "+n+"th Fibonacci number is : "+fibo);
    }
}
