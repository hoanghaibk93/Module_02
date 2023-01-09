package ss06_inheritance.bai_tap.point_movablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] array = {xSpeed, ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return super.toString()
                + " , speed=(xs,ys)="
                + Arrays.toString(getSpeed());
    }

    public String move() {
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        float[] array = {newX, newY};
        return "After move: (x,y)=" + Arrays.toString(array);
    }
}