package ss14_ngoai_le.thuc_hanh;

public class Demo5 {
    public static void main(String[] args) {
        int a =5;
        int d = 5;
        int e = 5;
        Integer b = a;
        int g = b;
        Integer c = Integer.valueOf(a);
        System.out.println(c.equals(d));
        System.out.println(c==d);
       // System.out.println();

        int m = new Integer(5);
        Integer f = new Integer(5);
        System.out.println(f==a);
        System.out.println(m==c);
      

    }
}
