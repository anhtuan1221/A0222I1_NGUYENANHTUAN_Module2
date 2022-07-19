package ss12_java_collection_framework.practice;

import java.util.LinkedList;

public class Main {
    public String toString(){
        return "a";
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.offer(1);
        l.offer(2);
        l.offer(3);
        int value = l.poll();
        System.out.println(value);
    }
}
