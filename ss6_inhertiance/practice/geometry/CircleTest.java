package ss6_inhertiance.practice.geometry;

public class CircleTest {
    public static void main(String[] args) {
        Cricle c=new Cricle();
        System.out.println(c);
        Cricle c1 = new Cricle(3.0);
        System.out.println(c1);
        Cricle c2 = new Cricle("red",false,3.5);
    }

    public static class Cricle extends Test.Shape {
        private double radius = 1.0;

        public Cricle() {
        }

        public Cricle(double radius) {
            this.radius = radius;
        }

        public Cricle(String color, boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.pow(radius, 2) * 3.14;
        }

        public double getPerimeter() {
            return 2 * radius * 3.14;
        }

        @Override
        public String toString() {
            return "A circle with radius= " + getRadius() + "," + " which is a subclass of " + super.toString();
        }

        @Override
        public void resize(double increasePercent) {
            double tmp = radius * increasePercent / 100;
            radius += tmp;
        }
    }

    public static class Square extends RectangleTest.Rectangle {
        public Square() {
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(String color, boolean filled, double side) {
            super(color, filled, side, side);
        }

        public double getSide() {
            return getWidth();
        }

        ;

        public void setSide(double side) {
            setWidth(side);
            setLength(side);
        }

        @Override
        public void setWidth(double width) {
            setSide(width);
        }

        @Override
        public void setLength(double length) {
            setSide(length);
        }

        @Override
        public String toString() {
            return "A Square with side="
                    + getSide()
                    + ", which is a subclass of "
                    + super.toString();
        }

    }
}
