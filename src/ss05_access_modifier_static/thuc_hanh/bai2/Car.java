package ss05_access_modifier_static.thuc_hanh.bai2;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    //public int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
