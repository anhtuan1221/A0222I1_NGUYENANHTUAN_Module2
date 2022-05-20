package ss3_arrayJava.baiTap.sum_2dArrays;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int col;
        int sum = 0;
        do {
            System.out.print("Muốn tính tổng cột mấy ? ");
            col = scanner.nextInt();
            if (col > 5) {
                System.out.print("Muốn tính tổng cột mấy ? ");

            }
        } while (col > 5);
        for (int i = 0; i < array.length; i++) {
            sum += array[i][col];
        }
        System.out.println("Tổng của cột thứ " + col+" là: " + sum);
    }
}
