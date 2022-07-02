package ss15_deBug_exception.excercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        boolean done = false;
        while (!done) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input side 1");
                double side1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Input side 2");
                double side2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Input side 3");
                double side3 = Double.parseDouble(scanner.nextLine());


                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println(triangle.getPerimeter());
                done = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
