package ss6_inhertiance.practice.geometry;

public class SquareTest {
    public static void main(String[] args) {
        Square s= new Square();
        Square s1=new Square(3.0);
        Square s2=new Square("black",true,2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
