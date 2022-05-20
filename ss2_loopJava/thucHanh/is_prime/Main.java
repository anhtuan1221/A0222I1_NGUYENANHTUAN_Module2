package ss2_loopJava.thucHanh.is_prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a number :");
        number = scanner.nextInt();
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <=Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                }
                i++;
            }
        }
        if (check) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
    }
}
