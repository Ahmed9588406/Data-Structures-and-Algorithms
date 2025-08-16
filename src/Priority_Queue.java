import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class Priority_Queue {
    public static void main(String[] args){
        // Priority_Queue: A FIFO data structure that serves elements with the highest Priority first before elements
        // with the lowest Priority


        // the elements in descending order from the collection
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            // By default the elements will be printed in ascending order
            System.out.println(queue.poll());
        }

    }
}
