package ss3_arrayJava.baiTap.remove_element_from_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int[] array={1,2,3,4};

        int number;
        int index =0;
        System.out.print("\nEnter a number: ");
        number = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == number) {
                index = j;
                break;
            }
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int j = 0; j < array.length - 1; j++) {
            System.out.println(array[j]);
        }
    }
}
