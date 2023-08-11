package DataStructuresAndAlgolInJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

public class QueueDSAlgol {

    public static void main(String[] args) {
        // a queue is a FIFO - First In First Out
        // Enqueueing and Dequeueing
        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Halrod");
        queue.offer("Nyakundi");
        System.out.println("Queue before removing the first customer: ");
        System.out.println(queue);
        queue.poll();

        System.out.println("Queue after removing the first customer: ");
        System.out.println(queue);

        // Check if the queue is empty
        System.out.println(queue.poll());

        // Check if the queue contains an object

        System.out.println(queue.contains("Steve"));

    }

    }

