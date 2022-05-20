package ss1_Introduction_to_java.th.leap_year_calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("%d is a leap year " + year);
                } else {
                    System.out.println("%d is Not a leap year " + year);
                }
            } else {
                System.out.println("%d is a leap year " + year);
            }
        } else {
            System.out.println("%d is Not a leap year " + year);
        }
    }
}
