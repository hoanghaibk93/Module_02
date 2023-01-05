package ss04_oop_class_object.bai_tap.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    String getter() {
        return "Start time:" + this.startTime + " , stop time: " + this.endTime;
    }

    long getElapsedTime() {
        return (this.endTime - this.startTime);
    }

}
