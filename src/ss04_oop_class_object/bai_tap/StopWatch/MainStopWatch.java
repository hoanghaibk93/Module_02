package ss04_oop_class_object.bai_tap.StopWatch;

public class MainStopWatch {
    public static void main(String[] args) {
        double[] array = new double[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        // sắp xếp từ lớn đến bé
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    double a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Calculate time of 1000000 number sort algorithm (milli second) :" + stopWatch.getElapsedTime());
    }
}


