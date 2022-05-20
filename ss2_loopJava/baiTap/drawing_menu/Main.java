package ss2_loopJava.baiTap.drawing_menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the triang le with the corner at botton-left");
            System.out.println("3. Draw the triang le with the corner at top-left");
            System.out.println("4. Draw the triang le with the corner at top righte");
            System.out.println("5. Draw the triang le with the corner at botton-right");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle ");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the triang le with the corner at botton-left ");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the triang le with the corner at top-left");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 6 - i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Draw the triang le with the corner at top right");
                    for (int i = 1; i <= 6; i++) {
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 6 - i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Draw the triang le with the corner at botton-right");
                    for (int i = 1; i <= 6; i++) {
                        for (int k = 1; k <= 6-i+1; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
