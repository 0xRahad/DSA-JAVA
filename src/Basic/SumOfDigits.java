package Basic;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0, r, temp, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = sc.nextInt();

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }

        System.out.print("sum of digits : "+sum);
    }
}
