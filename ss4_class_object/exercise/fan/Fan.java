package ss4_class_object.exercise.fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue"; 

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return ("Speed is: " + this.speed + " color is " + this.color + " Radius is " + this.radius + " fan is on ");
        } else {
            return ("Color is: " + this.color + " Radius: " + this.radius + " fan is off");
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.speed = MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;
        System.out.println(fan2.toString());
    }
}
