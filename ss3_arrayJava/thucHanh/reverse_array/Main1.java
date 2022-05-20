package ss3_arrayJava.thucHanh.reverse_array;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size does not exceed 20 ");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter  element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
