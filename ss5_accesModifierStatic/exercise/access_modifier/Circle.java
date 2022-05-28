package ss5_accesModifierStatic.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.pow(radius, 2) * 3.14;
    }

}
