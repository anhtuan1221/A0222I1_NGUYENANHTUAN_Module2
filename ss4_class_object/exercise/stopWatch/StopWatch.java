package ss4_class_object.exercise.stopWatch;

import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    public Date startTime;
    private Date endTime;


    public StopWatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000000);
        }
        StopWatch sw = new StopWatch();
        sw.start();
        Arrays.sort(arr);
        sw.stop();
        System.out.println("Elapsedtime " + sw.getElapsedTime() + " ms");
    }
}
