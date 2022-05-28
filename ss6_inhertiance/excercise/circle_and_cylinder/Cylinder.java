package ss6_inhertiance.excercise.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return height*super.getArea();
    }

    @Override
    public String toString() {
        return super.toString()+", Height= "+height+", Volume ="+getVolume();
    }
}
