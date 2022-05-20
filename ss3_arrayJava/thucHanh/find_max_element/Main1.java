package ss3_arrayJava.thucHanh.find_max_element;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20 ");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element: " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in array ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int largest = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            largest = Math.max(largest, array[j]);

        }
        System.out.println("The largest property value in the list is " + largest );
    }
}
