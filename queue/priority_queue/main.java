package queue.priority_queue;
import java.util.*;

public class main {

    public static void main (String[] args){
        Queue priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); //Collections.reverseOrder() reverses the order of priority

        priorityQueue.offer(2.1);
        priorityQueue.offer(5.0);
        priorityQueue.offer(3.5);
        priorityQueue.offer(4.1);
        priorityQueue.offer(1.9);

         //[1.9, 2.1, 3.5, 4.1, 5.0]
        while (!priorityQueue.isEmpty()) {
           System.out.println(priorityQueue.poll()); 
        }
       
        priorityQueue.offer("C");
        priorityQueue.offer("F");
        priorityQueue.offer("D");
        priorityQueue.offer("A");
        priorityQueue.offer("E");
      
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); 
         }
    }
}

