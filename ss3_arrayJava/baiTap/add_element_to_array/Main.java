package ss3_arrayJava.baiTap.add_element_to_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int N = array.length;
        Scanner scanner = new Scanner(System.in);
        int number, index;
        System.out.println("Enter number need insert ");
        number = scanner.nextInt();
        System.out.println("Enter index need insert");
        index = scanner.nextInt();
        int[] array1 = add(array, number, index);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    public static int[] add(int[] array, int number, int index) {
        int length = array.length;
        int[] tmp = new int[length + 1];
        for (int i = 0; i < length; i++) {
            tmp[i] = array[i];
        }
        for (int i = length; i > index; i--) {
            if (i != index) {
                tmp[i] = array[i - 1];
            }
        }
        tmp[index] = number;
        return tmp;
    }

    ;
}

