package ss6_inhertiance.excercise.point_moveablepoint;

public class Test {
    public static void main(String[] args) {
        Point p =new Point();
        Point p1 = new Point(2.1f,3.2f);
        MoveablePonit m= new MoveablePonit();
        MoveablePonit m1= new MoveablePonit(1.1f,2.2f);
        MoveablePonit m2= new MoveablePonit(1.2f,2.2f,3.3f,4.4f);
        float[] array = m2.getSpeed();
        System.out.println(array);
        System.out.println(p);
        System.out.println(p1);
        System.out.println(m);
        System.out.println(m1);
        System.out.println(m2.move());
    }
}
