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
}
