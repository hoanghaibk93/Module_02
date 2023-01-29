package ss07_abstract_interface.thuc_hanh.comparable;

import java.util.Comparator;

public class comparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        //return (int) (o1.getRadius()-o2.getRadius()); cach 1
        //cach 2
        if (o1.getRadius() > o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
