package ss06_inheritance.bai_tap.point_movablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(3,5,6,7);
        System.out.println(movablePoint);
        movablePoint.setSpeed(8,9);
        movablePoint.setX(3);
        System.out.println(movablePoint);
        movablePoint.setXSpeed(4);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
