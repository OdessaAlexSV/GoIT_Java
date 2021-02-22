package main.java.preparation.collection;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
