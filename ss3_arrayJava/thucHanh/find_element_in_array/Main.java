package ss3_arrayJava.thucHanh.find_element_in_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tuan", "Ronaldo", "Rooney"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student ");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found " + input_name + " in the list ");
        }
    }
}
