package ss11_das_stack_queue.excercise.reseverArray;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class ReverseStack {
    public static Scanner scanner = new Scanner(System.in);

    public static List<Integer> inputArray(List<Integer> arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("Input element " + i + " :");
            arr.add(Integer.valueOf(scanner.nextLine()));
        }
        return arr;
    }

    public static List<Integer> reverseArray(List<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        for (Integer e : arr) {
            stack.push(e);
        }
        arr = new ArrayList<>();
        while (!stack.empty()) {
            arr.add(stack.pop());
        }
        return arr;
    }

    public static String reverseString(String str) {
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            strings.push(String.valueOf(str.charAt(i)));
        }
        String result = "";
        while (!strings.empty()) {
            result += strings.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int length = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        list = inputArray(list, length);
        list = reverseArray(list);
        for (Integer e : list) {
            System.out.print(e + " ");
        }
        System.out.println("\n----------------");
        System.out.print("Enter a string :");
        String str = scanner.nextLine();
        str = reverseString(str);
        System.out.print("result :" + str);
    }
}
