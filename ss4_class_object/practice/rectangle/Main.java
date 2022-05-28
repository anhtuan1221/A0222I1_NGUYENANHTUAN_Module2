package ss4_class_object.practice.rectangle;
import java.util.Scanner;
class Rectangle {
    double height, width;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle { " + "width= " + width + " , height= " + height + "}";
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a width");
        double width= scanner.nextDouble();
        System.out.println("Enter a height");
        double height = scanner.nextDouble();
        Rectangle rectangle= new Rectangle(width,height);
        System.out.println("Your rectangle \n"+rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
