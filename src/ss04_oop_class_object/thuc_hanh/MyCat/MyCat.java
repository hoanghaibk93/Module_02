package ss04_oop_class_object.thuc_hanh.MyCat;

public class MyCat {
    private String name;

    public MyCat(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public static void main(String[] args) {
//        MyCat myCat = new MyCat("Kitty");
//        System.out.println("Before call process: " + myCat.getName());
//        process(myCat);
//        System.out.println("After call process: " + myCat.getName());
//    }
//    public static void process(MyCat myCat) {
//        myCat.setName("Doraemon");
//    }
    public static void main(String[] args) {
        MyCat myCat = new MyCat("Kitty");
        System.out.println("Before call process: " + myCat.getName());
        System.out.println(myCat);
        process(myCat);
        System.out.println("After call process: " + myCat.getName());
    }
    public static void process(MyCat myCat) {
        myCat = new MyCat("Doraemon");
        System.out.println(myCat);
    }
}

