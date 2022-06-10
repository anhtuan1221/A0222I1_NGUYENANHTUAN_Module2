package ss7_abstract_class_interface.excercise.interface_resizable;

import ss6_inhertiance.practice.geometry.CircleTest;
import ss6_inhertiance.practice.geometry.RectangleTest;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ss6_inhertiance.practice.geometry.Test.Shape[] arr = new ss6_inhertiance.practice.geometry.Test.Shape[3];
        arr[0] = new CircleTest.Cricle("green", false, 2.0);
        arr[1] = new RectangleTest.Rectangle("red", true, 2.9, 1.2);
        arr[2] = new CircleTest.Square("black", false, 2.3);
        for (ss6_inhertiance.practice.geometry.Test.Shape e : arr) {
            if (!(e instanceof CircleTest.Square)) {
                e.resize(new Random().nextInt(100));
                System.out.println(e);
            }
        }
    }
}
