package ss06_inheritance.bai_tap.triangle;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color ="green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(String color) {
        this.color = color;
    }
//    public static void go(){
//        System.out.println("con ga");
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "A Shape with color of " + getColor() + " and " + (isFilled()?"filled":"not filled");
    }
}
