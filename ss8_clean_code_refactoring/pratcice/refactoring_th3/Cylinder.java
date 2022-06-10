package ss8_clean_code_refactoring.pratcice.refactoring_th3;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}
