package ss06_inheritance.bai_tap.point_movablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(3.34f,5.123f,6,7.5f);
        System.out.println(movablePoint);
        movablePoint.setSpeed(8.4f,9.6f);
        movablePoint.setX(3);
        System.out.println(movablePoint);
        movablePoint.setXSpeed(4.0f);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
