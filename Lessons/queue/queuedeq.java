import java.util.*;
public class queuedeq {
    static class Queue{
        static Deque<Integer> que = new LinkedList<>();

        public static boolean isEmpty(){
            return que.isEmpty();
        }

        public static void add(int data){
            que.addFirst(data);
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return que.removeLast();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is");
                return -1;
            }
            return que.getLast();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(0); q.add(1); q.add(2); q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
