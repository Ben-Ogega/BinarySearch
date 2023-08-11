package DataStructuresAndAlgolInJava;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDS {

    public static void main(String[] args) {
        // Priority Queue is a FIFo data structure that serves
        // elements with the highest priority first before elements with
        // lower priority
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(1.0);
        queue.offer(2.5);

        while (!queue.isEmpty()){
            System.out.print(queue.poll() + ", ");
        }
    }
}
