package ss4_class_object.exercise.quadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
   private double a;
    private double b;
    private double c;
    double delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        delta = b*b - (4 * a * c);
        return delta;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(delta)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(delta)) / 2 * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("x1 = " + quadraticEquation.getRoot1() + "\nx2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("x= " + quadraticEquation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}

