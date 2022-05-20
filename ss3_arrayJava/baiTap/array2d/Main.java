package ss3_arrayJava.baiTap.array2d;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(5);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || (i+j == (array.length-1)) ) {
                    sum += array[i][j];
                    if (i == j && (i+j == (array.length-1))) {
                        sum += array[i][j];
                    }
                }
            }
        }
        System.out.print("Tổng đường chéo hình vuông là: " + sum);
    }
    // 0 4, 1 3, 2 2, 3 1, 4 0;
}
