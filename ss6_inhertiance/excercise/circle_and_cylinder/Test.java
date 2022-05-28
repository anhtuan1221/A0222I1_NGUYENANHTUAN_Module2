package ss6_inhertiance.excercise.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1= new Circle(4.0,"red");
        Cylinder c2 =new Cylinder();
        Cylinder c3= new Cylinder(9.0);
        Cylinder c4 =new Cylinder(5.1,"yelllow",2.9);
        Circle c5 =new Cylinder();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5.getArea());
        System.out.println(c5);
        System.out.println(c5.getColor());
    }
}
