package ss7_abstract_class_interface.practice.interface_comparable;

import ss6_inhertiance.practice.geometry.Test;

public class Circle extends Test.Shape {
    private double radius;

    public Circle() {
        radius = 1;
    }

    ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A circle with radius= "
                + getRadius()
                + " which is subclass of"
                + super.toString();
    }

    @Override
    public void resize(double increasePercent) {
        double tmp = radius * increasePercent / 100;
        radius += tmp;
    }
}
