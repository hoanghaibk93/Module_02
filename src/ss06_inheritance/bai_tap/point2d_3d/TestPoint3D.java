package ss06_inheritance.bai_tap.point2d_3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D.setZ(5);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        point3D.setXYZ(1, 2, 3);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
        point3D = new Point3D(5, 6, 7);
        point3D.setY(3);
        System.out.println(point3D);

    }
}
