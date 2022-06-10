package ss6_inhertiance.practice.geometry;

public class SquareTest {
    public static void main(String[] args) {
        CircleTest.Square s= new CircleTest.Square();
        CircleTest.Square s1=new CircleTest.Square(3.0);
        CircleTest.Square s2=new CircleTest.Square("black",true,2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
