package ss1_Introduction_to_java.th.bmi_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your weight (in kilogram): ");
        double weight = scanner.nextFloat();
        System.out.println("Your  height (in meter): ");
        double height = scanner.nextFloat();
        double bmi = weight / Math.pow(height, 2);
        System.out.println("%-20s%s" + "bmi" + "Interpretation\n");
        if (bmi < 18.5)
            System.out.println("%-20.2f%s " + bmi + " Underweight");
        else if (bmi < 25.0) {
            System.out.println("%-20.2f%s " + bmi + " Normal");
        } else if (bmi < 30) {
            System.out.println("%-20.2f%s " + bmi + " Overweight");
        } else {
            System.out.println("%-20.2f%s " + bmi + " Obese60");
        }
    }
}
