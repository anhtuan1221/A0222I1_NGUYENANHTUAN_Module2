package ss14_sort_algorithm.excercise.insertion_sort_by_step;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + array.length + " value ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Your input array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        insertionSortByStep(array);
        System.out.print("array after sort :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void insertionSortByStep(int[] array) {
        System.out.println("Khai báo 2 biến x và pos để (x) nhận giá trị cần xét còn pos nhận vị trí để chèn x");
        int x, pos;
        for (int i = 1; i < array.length; i++) {
            System.out.println("Gán x = array[" + i + "] (x = " + array[i] + ")");
            x = array[i];
            System.out.println("Gán pos = i (pos = " + i + ")");
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Vì " + x + " nhỏ hơn " + array[pos - 1] + " nên hoán đổi vị trí giữa " + x + " và " + array[pos - 1]);
                System.out.println(" >> chèn " + array[pos - 1] + " vào vị trí của " + x + " (vị trí " + (pos) + ")");
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(" >> chèn " + x + " vào vị trí của " + array[pos] + " lúc nảy, (vị trí " + pos + ")");
                array[pos] = x;
                System.out.println("array [pos]=x"+array[pos]+x);
                System.out.println(">>>>>>>>Mảng lúc này: ");
                for (int item : array) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
//            if (x > array[pos - 1]) {
//                System.out.println(x + " lớn hơn " + array[pos - 1] + " nên giữ nguyên vị trí, mảng không thay đổi, tăng i lên " + (i + 1));
//            }
        }
    }
}
