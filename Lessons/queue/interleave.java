/*
 * a queue will be given (with even number of elements), we need to readjust the elements so that the first half are mixed with the other half
 *  let 12345678910 be the queue, then we need to make it : 1 6 3 7 4 8 5 9 6 10
 * we can do this by first add the first half to a separate queue, then add the first half elements at the rear of the first queue
 */
import java.util.*;
public class interleave {
   public static void weave(Queue<Integer> sourcequeue){
     Queue<Integer> bufferqueue = new LinkedList<>();
     int size = sourcequeue.size();

     // use a size variable instead of using sourcequeue.size() directly in the for loop, since the size will keep changing in every iteration, due to removal of elements
     for(int i = 0; i < (size/2); i++){
        bufferqueue.add(sourcequeue.remove());
     }
     for(int i = 0; i<size/2; i++){
        sourcequeue.add(bufferqueue.remove());
        sourcequeue.add(sourcequeue.remove());
     }
   }
   public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();
    q.add(1); q.add(2); q.add(3); q.add(4); q.add(5); q.add(6); q.add(7); q.add(8); q.add(9); q.add(10);
    weave(q); int size = q.size();
    for(int i = 0; i<size; i++){
        System.out.print(q.peek() + " ");
        q.remove();
    }
   }
}
