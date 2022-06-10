package ss7_abstract_class_interface.excercise.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("red", true, 2.1, 3.2);
        shapes[1] = new Square("blue", false, 3.1);
        for (Shape e : shapes) {
            if (e instanceof Square) {
                ((Square) e).howtoColor();
            }
        }

    }
}
