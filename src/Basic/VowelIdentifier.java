package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VowelIdentifier {
    public static void main(String[] args) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");

        String input = sc.next().toLowerCase();
        char character = input.charAt(0);
        if (vowels.contains(character)) {
            System.out.println(input + " is a vowel");
        } else {
            System.out.println(input + " is not a vowel");
        }
    }
}
