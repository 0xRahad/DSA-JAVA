package Basic;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        //double n, sum = 0.0;

        System.out.print("Enter the last number: ");
        n = sc.nextInt();

    }

    public static void sumNormalSeries(int n, int sum) {
        for (int i = 1; i <= n; i = i + 1) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("The sum is : " + sum);
    }

    public static void sumOddSeries(int n, int sum) {
        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("The sum is : " + sum);
    }

    public static void sumEvenSeries(int n, int sum) {
        for (int i = 2; i <= n; i = i + 2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("The sum is : " + sum);
    }

    public static void sumDoubleSeries(double n, double sum) {
        for (double i = 1.5; i <= n; i = i + 1) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("The sum is : " + sum);
    }
}
