package ss06_inheritance.bai_tap.point2d_3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ() {
        float[] array = {getX(), getY(), getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "(x,y,z)=" + Arrays.toString(getXYZ());
    }
}
