package functions;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        infinityLoop();
    }
    
    public static void printAverage(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double average = (a+b+c)/3.0;
        System.out.println("average: "+average);
        sc.close();;
    }

    public static void sumOfOdds(){
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
    public static int returnGreater(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if(a>b){
            return a;
        }else{
            return b;
        }

    }
    public static double circumference(){
        double r, circumference;
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        circumference = 2 * Math.PI * r;
                sc.close();
        return circumference;

    }

    public static void infinityLoop(){
        do {
        System.out.println("Awesome");
    } while (true);
    }
}
