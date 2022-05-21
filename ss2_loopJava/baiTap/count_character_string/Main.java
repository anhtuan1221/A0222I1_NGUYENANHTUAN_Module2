package ss2_loopJava.baiTap.count_character_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "abaabvcdf";
        char character;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        character = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Varaible connt value: " + count);
    }
}
