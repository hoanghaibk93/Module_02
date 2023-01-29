package ss06_inheritance.thuc_hanh.demo;

public class Test {
    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        a.p(10);
//        a.p(10.0);
//        b.p(10);
//        b.p(10.0);
        Rectangle rectangle = new Rectangle();
        Geometric geometric = new Geometric();
        Geometric geometric1 = new Rectangle();
//        rectangle.callName();
//        geometric.callName();
       // geometric1.callName();
        System.out.println( geometric1 instanceof Rectangle);
        System.out.println( geometric1 instanceof Geometric);
        Geometric geometrics[] = new Geometric[2];
        geometrics[0] = new Rectangle();
        geometrics[1] = new Circle();
        ((Rectangle)geometrics[0]).callName();

    }
}
