package ss3_arrayJava.thucHanh.ungDungDemSL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Enter a size: ");
            }
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element array " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.printf("%-30s%s", "Element in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
