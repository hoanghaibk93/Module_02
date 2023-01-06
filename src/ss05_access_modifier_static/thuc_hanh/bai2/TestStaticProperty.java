package ss05_access_modifier_static.thuc_hanh.bai2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}

