package ss6_inhertiance.excercise.point2d_point3d;

public class Point3d extends Point2d{
    private float z=0.0f;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x ,float y,float z){
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] array = new float[3];
        array[0]=this.getX();
        array[1]=this.getY();
        array[2]=z;
        return array;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x= "+getX()+
                "y= "+getY()+
                "z=" + z +
                " XYZ= "+getXYZ()+
                '}';
    }
}
