package Basic;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(500);
                System.out.println(num + " x " + i + " = " + num * i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
