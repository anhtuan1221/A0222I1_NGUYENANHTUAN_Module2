package ss3_arrayJava.baiTap.find_min_inArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Enter a size");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element array " + (i + 1) + " ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("\nElement min is: "+min);
        int[] arr={0,0,0,0};
    }
}
