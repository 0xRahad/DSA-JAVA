package Pattern;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        row = sc.nextInt();

        System.out.print("Enter Column: ");
        column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
