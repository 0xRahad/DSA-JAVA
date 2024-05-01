package patterns;
public class SolidPattern {
    public static void main(String[] args) {

        /***
         * Q1. Print the pattern. (column will be 5)
         */

        for (int i = 1; i<5; i++){
            for (int j = 1; j<6;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
