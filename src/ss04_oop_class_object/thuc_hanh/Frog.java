package ss04_oop_class_object.thuc_hanh;

public class Frog {
    static int frogCount = 0;

    static int getCount() {
        return frogCount;
    }

    protected Frog() {
        frogCount += 1;
    }

    //    public Frog(int frogSize) {
//        this.frogSize = frogSize;
//    }
//
//    public int getFrogSize() {
//        return frogSize;
//    }
}
    class TestFrog {
        public static void main(String[] args) {
            new Frog();
            new Frog();
            Frog f = new Frog();
            //System.out.println(f.getFrogSize());
            Frog.getCount();
            System.out.println(Frog.getCount());
        }
        void go() {
            System.out.println(Frog.getCount());
        }
    }
