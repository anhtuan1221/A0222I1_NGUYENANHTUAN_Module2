package ss6_inhertiance.practice.geometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r =new Rectangle();
        Rectangle r1 = new Rectangle(2.0,1.0);
        Rectangle r2= new Rectangle("green",false,4.0,6.0);
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
    }

    public static class Rectangle extends Test.Shape {
        private double width = 1.0;
        private double length = 1.0;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(String color, boolean filled, double width, double length) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        @Override
        public String toString() {
            return "A rectangle with width= " + getWidth() + " and " + " lenght= " + getLength() +
                    ", which is a subclass of " + super.toString();
        }

        @Override
        public void resize(double increasePercent) {
            width += width * increasePercent/100;
            length += length * increasePercent/100;
        }
    }
}
