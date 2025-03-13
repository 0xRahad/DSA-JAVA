package Basic;

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int m = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.printf("Number of digits in "+m+" = "+count);
    }
}