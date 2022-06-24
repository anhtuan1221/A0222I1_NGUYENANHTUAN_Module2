package ss15_deBug_exception.practice.arrayExample;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom(){
        Integer[] array= new Integer[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=new Random().nextInt(100);
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();
        Scanner scanner= new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Giá trị của phần tử  "+x+" là " +arr[x]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt qua giới hạn mảng");
        }
    }
}
