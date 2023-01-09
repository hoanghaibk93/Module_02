package ss06_inheritance.bai_tap.point_movablepoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setXY(3.5f,4.2f);
        System.out.println(point);
        point.setX(5.5f);
        System.out.println(point);
    }
}
