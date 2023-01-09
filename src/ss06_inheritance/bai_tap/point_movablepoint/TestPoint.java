package ss06_inheritance.bai_tap.point_movablepoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setXY(3,4);
        System.out.println(point);
        point.setX(5);
        System.out.println(point);
    }
}
