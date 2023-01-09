package ss06_inheritance.bai_tap.point2d_3d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(1.1f, 2);
        System.out.println(point2D);
        point2D.setXY(2.5f, 4);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
        System.out.println(point2D.getX());
    }
}
