package ss6_inhertiance.practice.geometry;

public class CircleTest {
    public static void main(String[] args) {
        Cricle c=new Cricle();
        System.out.println(c);
        Cricle c1 = new Cricle(3.0);
        System.out.println(c1);
        Cricle c2 = new Cricle("red",false,3.5);
    }
}
