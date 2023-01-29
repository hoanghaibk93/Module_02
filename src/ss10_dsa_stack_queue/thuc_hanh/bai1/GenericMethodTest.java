package ss10_dsa_stack_queue.thuc_hanh.bai1;

public class GenericMethodTest {
    public static < E > void printArrayGeneric( E[] inputArrayGeneric ) {
        // Display array elements
        for(E elementGeneric : inputArrayGeneric) {
            System.out.printf("%s ", elementGeneric);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] integers = {1,2,3,4,5};
        String [] strings ={"a","b","c","d"};
        printArrayGeneric(integers);
        printArrayGeneric(strings);
    }
}
