import java.util.LinkedList;
import java.util.Queue;
public class Queue_implementation {
    public static void main(String[]args){
        /*
        * Queue: Is a FIFO a Collection designed for holding elements prior to processing
        * Linear data structure
        *
        * add = enqueue, offer()
        * remove = dequeue, poll()
        * */

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);
        // size of the queue
        System.out.println(queue.size());
        // Peek method used to see the Element in the first of the Queue
        System.out.println(queue.peek());

        // Dequeue the first element from the begining of the queue
        System.out.println(queue.poll());

        // contains method tells us that an item is in the queue or not
        System.out.println(queue.contains("Chad")); // returning the index

        System.out.println(queue);

    }
}
