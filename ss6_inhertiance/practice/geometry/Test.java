package ss6_inhertiance.practice.geometry;

import ss7_abstract_class_interface.excercise.interface_resizable.Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape s= new Shape("yellow", false) {
            @Override
            public void resize(double increasePercent) {

            }
        };
        System.out.println(s);
    }

    public abstract static class Shape implements Resizeable {
        private String color = "green";
        private boolean filled = true;

        public Shape() {
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public String toString() {
            return String.format("A Shape with color of %s and %s",  getColor(), filled ? "filled" :"not filled");
        }
    }
}

