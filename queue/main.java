package queue;
import java.util.*;

public class main {
    public static void main(String[] args){
        Queue myQueue = new LinkedList<String>();
        System.out.println(myQueue.isEmpty());
        
        myQueue.offer("Karen");
        myQueue.offer("Chad");
        myQueue.offer("Troll");
        myQueue.offer("Adonis");
        
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        
        myQueue.poll();
        myQueue.poll();
        myQueue.poll();

        System.out.println(myQueue);
        System.out.println(myQueue.peek());
    }
}
