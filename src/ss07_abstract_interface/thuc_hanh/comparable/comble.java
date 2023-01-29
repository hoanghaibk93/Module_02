package ss07_abstract_interface.thuc_hanh.comparable;

public class comble extends Circle implements Comparable<Circle>{
    @Override
    public int compareTo(Circle o) {
        return this.getColor().compareTo(o.getColor());
    }
}
